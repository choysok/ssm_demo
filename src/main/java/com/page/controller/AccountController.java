package com.page.controller;


import com.page.domain.Account;
import com.page.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;



    @RequestMapping("testFindAll")
    public String  testFindAll(Model model){

        System.out.println("表现层：查询所有的用户信息-----------------------");
        List<Account> list = accountService.findAll();
        model.addAttribute("listOfAccount",list);
        return "list";
    }
}
