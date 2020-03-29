package com.huawei.it.spring;

import com.huawei.it.spring.model.User;
import com.huawei.it.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Ricky
 * @Date: 2019-08-11 17:02
 */
public class MainAPP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");

        User user = new User();
        user.setAge(23);
        user.setName("张三");
        user.setPassword("123123");
        user.setUsername("admin");

        userService.addUser(user);
    }

}
