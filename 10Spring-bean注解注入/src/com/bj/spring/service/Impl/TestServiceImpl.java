package com.bj.spring.service.Impl;


import com.bj.spring.dao.TestDao;
import com.bj.spring.model.Student;
import com.bj.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 10:18
 */

//component 注解的作用类似Spring配置文件中的bean标签通知Spring创建一个对象其中参数与bean标签的id值是作用相同的
    //参数是可选 默认使用当前类型作为bean的id
@Component("testService")
public class TestServiceImpl implements TestService {

// Autowired 默认使用根据类型进行自动注入  这个注解可以卸载属性也可以写在属性的set方法上
    // 如果写在属性上那么不需要对应的get和set方法
    @Autowired
    private TestDao testDao;

    @Override
    public void test() {
        System.out.println("这是TestServiceImpl中的方法");
        testDao.testDao();
    }

//    public TestDao getTestDao() {
//        return testDao;
//    }
//
//    public void setTestDao(TestDao testDao) {
//        this.testDao = testDao;
//    }
}
