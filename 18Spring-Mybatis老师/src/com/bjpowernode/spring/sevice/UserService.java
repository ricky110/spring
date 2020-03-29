package com.bjpowernode.spring.sevice;

import com.bjpowernode.spring.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> selectUserAll();
    User selectUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
