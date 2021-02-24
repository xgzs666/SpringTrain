package com.train.service;

import com.train.dao.UserDao;

public class UserService {

    public void service() {
        System.out.println("service");
    }

    public UserService(){}

    public UserService(String s) {

    }

    private UserDao userDao;

    //业务对象userDao set注入（提供set方法）
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
