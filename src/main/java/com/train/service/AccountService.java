package com.train.service;

import com.train.dao.AccountDao;

public class AccountService {
    public void test() {
        System.out.println("AccountService");
    }

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void test2() {
        accountDao.test();
    }
}
