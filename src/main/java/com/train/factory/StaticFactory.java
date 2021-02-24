package com.train.factory;

import com.train.dao.UserDao;
import com.train.service.UserService;

//静态工厂
public class StaticFactory {

   public static UserDao createUserDao() {
       System.out.println("UserDao静态实例化");
       return new UserDao();
   }

   public static UserService createUserService() {
       System.out.println("UserService静态实例化");
       return  new UserService();
   }
}
