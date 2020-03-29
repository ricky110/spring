package com.bjpowernode.spring.sevice.impl;

import com.bjpowernode.spring.dao.UserDao;
import com.bjpowernode.spring.model.User;
import com.bjpowernode.spring.sevice.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userService")
public class UserSerivceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> selectUserAll() {
        return userDao.selectUserAll();
    }

    @Override
    public User selectUserById(Long id) {
        return userDao.selectUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
