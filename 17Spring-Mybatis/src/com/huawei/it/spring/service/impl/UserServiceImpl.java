package com.huawei.it.spring.service.impl;

import com.huawei.it.spring.dao.UserDao;
import com.huawei.it.spring.model.User;
import com.huawei.it.spring.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Ricky
 * @Date: 2019-08-11 14:30
 */
@Component("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
