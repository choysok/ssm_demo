package com.page.service;

import com.page.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
