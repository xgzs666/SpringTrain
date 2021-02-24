package com.train.factory;

import com.train.dao.UserDao;
import com.train.service.UserService;

public class Factory {
  public UserService createUserService() {
      System.out.println("UserService实例化");
      return new UserService();
  }

  public UserDao createUserDao() {
      System.out.println("UserDao实例化");
      return new UserDao();
  }
}
