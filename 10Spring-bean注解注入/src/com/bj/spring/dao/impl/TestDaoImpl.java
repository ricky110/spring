package com.bj.spring.dao.impl;

import com.bj.spring.dao.TestDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: Ricky
 * @Date: 2019-08-03 14:58
 */

@Repository("testDao")
public class TestDaoImpl implements TestDao {

    @Override
    public void testDao() {
        System.out.println("这是TestDaoImpl类中的方法");
    }
}
