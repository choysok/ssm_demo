package com.page.controller;


import com.page.domain.Account;
import com.page.service.AccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/testFindAll")
    public String  testFindAll(Model model){

        System.out.println("表现层：查询所有的用户信息-----------------------");
        List<Account> list = accountService.findAll();
        model.addAttribute("listOfAccount",list);
        return "list";
    }


    @RequestMapping("/testSave")
    public void   testSave(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：保存用户信息-----------------------");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/testFindAll");
        return;
    }
}
