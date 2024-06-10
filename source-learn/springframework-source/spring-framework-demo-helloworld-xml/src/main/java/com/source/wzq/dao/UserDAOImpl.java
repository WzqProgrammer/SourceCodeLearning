package com.source.wzq.dao;

import com.source.wzq.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * @author wangzhengqing
 * @Date 2024/6/10 22:10
 * @Description
 */
public class UserDAOImpl {

    /**
     * init.
     */
    public UserDAOImpl() {
    }

    /**
     * mocked to find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("pdai", 18));
    }
}
