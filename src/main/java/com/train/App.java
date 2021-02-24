package com.train;

import com.train.dao.UserDao;
import com.train.factory.StaticFactory;
import com.train.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        //获取spring上下文环境（加载多个配置文件,把多个配置文件导入到总的spring.xml文件,然后获取spring.xml文件内容）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //通过getBean方法得到spring容器中实例化好的bean对象（实例化Bean对象）
        //userService代表的是配置文件中的bean标签的id属性值
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.service();
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.test();

        //获取spring上下文环境（加载单个个配置文件）
        ApplicationContext ac = new ClassPathXmlApplicationContext("service.xml");
        UserService userService1 = (UserService) ac.getBean("userService");
        userService1.service();


    }
}
