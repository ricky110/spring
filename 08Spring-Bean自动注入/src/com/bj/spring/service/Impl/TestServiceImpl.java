package com.bj.spring.service.Impl;


import com.bj.spring.dao.TestDao;
import com.bj.spring.model.Student;
import com.bj.spring.service.TestService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 10:18
 */
public class TestServiceImpl implements TestService {

    private TestDao testDao;

    @Override
    public void test() {
        System.out.println("这是TestServiceImpl中的方法");
        testDao.testDao();
    }

//    public TestDao getTestDao() {
//        return testDao;
//    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
}
