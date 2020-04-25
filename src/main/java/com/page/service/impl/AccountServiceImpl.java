package com.page.service.impl;

import com.page.dao.AccountDao;
import com.page.domain.Account;
import com.page.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有用户。。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println("业务层：保存用户。。。。");
        accountDao.saveAccount(account);
    }
}
