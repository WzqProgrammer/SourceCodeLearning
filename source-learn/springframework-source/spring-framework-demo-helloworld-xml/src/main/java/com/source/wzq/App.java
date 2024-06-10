package com.source.wzq;

import com.source.wzq.entity.User;
import com.source.wzq.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ${USER}
 * @Date ${DATE} ${TIME}
 * @Description
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");

        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);

        List<User> userList = userService.findUserList();

        userList.forEach(a -> System.out.println(a.getName() + ", " + a.getAge()));
    }
}