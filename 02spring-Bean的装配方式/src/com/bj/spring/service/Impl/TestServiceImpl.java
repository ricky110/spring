package com.bj.spring.service.Impl;

import com.bj.spring.dao.TestDao;
import com.bj.spring.service.TestService;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 10:18
 */
public class TestServiceImpl implements TestService {
    public TestServiceImpl() {
        System.out.println("这个是TestServiceImpl类中的无参构造======");
    }

    private TestDao testDao;

    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void test() {
        System.out.println("这是TestServiceImpl类中的test方法");
        testDao.daoTest();
    }
}
