package com.bj.spring.dao.impl;

import com.bj.spring.dao.TestDao;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 11:03
 */
public class TestDaoImpl implements TestDao {

    public TestDaoImpl() {
        System.out.println("这个是TestDaoImpl类中的无参构造-----");
    }

    @Override
    public void daoTest() {

        System.out.println("这个是TestDaoImpl类中的daoTest方法");
    }
}
