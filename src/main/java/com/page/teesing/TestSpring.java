package com.page.teesing;


import com.page.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
   如果需要在此位置进行单元测试 需要把Junit的Scope的值设置为compile
 */
public class TestSpring {

    public void run1(){
        //@Text
        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as   = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
