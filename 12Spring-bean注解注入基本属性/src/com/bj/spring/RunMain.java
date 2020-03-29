package com.bj.spring;

import com.bj.spring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 10:47
 */
public class RunMain {
    public static void main(String[] args) {
        // 根据spring的配置文件的全限定名创建一个spring的上下文对象（启动了spring的容器）
        // 如果文件存放在了src目录中那么这里只需要填写配置文件名即可否则需要填写配置文件全限定名

        //同时引入过个配置文件 平等的多配置文件引入  不推荐使用  ，因为多个文件需要在代码中进行指定，吐过需要修改需要修改代码
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml");

        //推荐使用这种方式
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 根据spring配置文件中的某个bean的id属性值获取对应的实例对象
        TestService testService = (TestService) ac.getBean("testService");
        testService.test();

    }
}
