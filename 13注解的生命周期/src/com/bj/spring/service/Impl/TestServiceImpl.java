package com.bj.spring.service.Impl;




import com.bj.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
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
//指定Spring中的bean作用范围多例模式 每次getbean获取的对象不是同一个对象 默认单例
// 还可以取值为request和session表示请求单例和会话单例（只适用于web工程）


public class TestServiceImpl implements TestService {
    //默认根据名字进行自动注入 如果没有找到对象名字那么将根据类型进行自动装配 如果类型也不存在则注入失败 会报异常


    @Override
    public void test() {
        System.out.println("这是TestServiceImpl中的方法");

    }


    @PostConstruct
    public void initMethod() {
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void destoryMethod() {
        System.out.println("销毁方法");
    }


}
