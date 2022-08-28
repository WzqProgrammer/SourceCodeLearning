package com.source.wzq;

import com.source.wzq.mapper.UserMapper;
import com.source.wzq.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DemoStart {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";

        InputStream inputStream = null;

        try{
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User userParam = new User();
            userParam.setSchoolName("Sunny School");
            List<User> userList = userMapper.queryUserBySchoolName(userParam);
            for(User user: userList){
                System.out.println("name: " + user.getName() + "; email: " + user.getEmail());
            }
        }
    }
}
