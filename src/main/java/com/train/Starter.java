package com.train;

import com.train.dao.UserDao;
import com.train.factory.StaticFactory;
import com.train.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryExtensionsKt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
//获取spring上下文环境（加载多个配置文件）
        ApplicationContext ac = new ClassPathXmlApplicationContext("service.xml","dao.xml");
        UserService userService = (UserService) ac.getBean("userService");
//        userService.service();
        UserDao userDao = (UserDao) ac.getBean("userDao");
//        userDao.test();

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService1 = (UserService) beanFactory.getBean("userService");
        userService1.service();
    }
}
