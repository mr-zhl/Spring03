package com.lanou.dao.impl;

import com.lanou.dao.UserDao;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:Spring-context.xml")
class UserDaoImplTest {
    @Autowired
    private UserDao userDao;

    @org.junit.jupiter.api.Test
    void seletAll() {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        //UserDao userDao = context.getBean(UserDao.class);
        int row = userDao.insert("薛之谦", "12234");
       System.out.println(row);
    }

    @org.junit.jupiter.api.Test
    void deleted() {
        int row = userDao.deleted(2);
        System.out.println(row);
    }


    @org.junit.jupiter.api.Test
    void mode() {

    }

    @org.junit.jupiter.api.Test
    void selectOne() {
    }

    @org.junit.jupiter.api.Test
    void selectALl() {
    }

    @org.junit.jupiter.api.Test
    void selectcount() {
    }
}