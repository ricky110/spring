package com.bjpowernode.spring;

import com.bjpowernode.spring.model.User;
import com.bjpowernode.spring.sevice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) ac.getBean("userService");
//
//        User user=new User();
//        user.setAge(23);
//        user.setName("王五");
//        user.setPassword("12345");
//        user.setUsername("王五");
//        userService.addUser(user);

            List<User> list=userService.selectUserAll();
            for(User u:list){
                System.out.println(u);
            }
//        System.out.println(userService.selectUserById(32L));
//          User user2=new User();
//            user2.setAge(23);
//            user2.setName("张飞");
//            user2.setPassword("654321");
//            user2.setUsername("zhangfei");
//            user2.setId(34L);
//            userService.updateUser(user2);

//        userService.deleteUser(32L);
    }
}
