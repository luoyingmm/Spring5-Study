package com.luoyingmm.service;

import com.luoyingmm.dao.UserDao;
import com.luoyingmm.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
