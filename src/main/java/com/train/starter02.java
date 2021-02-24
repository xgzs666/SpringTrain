package com.train;

import com.train.dao.AccountDao;
import com.train.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class starter02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.test2();
    }
}
