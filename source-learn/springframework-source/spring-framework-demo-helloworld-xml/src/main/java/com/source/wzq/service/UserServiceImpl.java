package com.source.wzq.service;

import com.source.wzq.dao.UserDAOImpl;
import com.source.wzq.entity.User;

import java.util.List;

/**
 * @author wangzhengqing
 * @Date 2024/6/10 22:13
 * @Description
 */
public class UserServiceImpl {

    /**
     * user dao impl.
     */
    private UserDAOImpl userDao;

    /**
     * init.
     */
    public UserServiceImpl() {
    }

    /**
     * find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return this.userDao.findUserList();
    }

    /**
     * set dao.
     *
     * @param userDao user dao
     */
    public void setUserDao(UserDAOImpl userDao) {
        this.userDao = userDao;
    }
}
