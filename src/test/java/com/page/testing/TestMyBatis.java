package com.page.testing;

import com.page.dao.AccountDao;
import com.page.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
   @Test
    public void  run() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        AccountDao accountDao = factory.openSession().getMapper(AccountDao.class);
       List<Account> list = accountDao.findAll();
       for(Account account:list){
           System.out.println(account);
       }
       //关闭资源
        factory.openSession().close();
        inputStream.close();

    }

    @Test
    public void  run1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = factory.openSession();

        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(100.0);
        accountDao.saveAccount(account);

        //增，删，改需要提交 事务。
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        inputStream.close();

    }

}
