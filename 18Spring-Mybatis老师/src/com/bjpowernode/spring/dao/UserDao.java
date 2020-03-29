package com.bjpowernode.spring.dao;

import com.bjpowernode.spring.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//MyBatis的一个注解，这个注解标志着当前的接口是一个SQL映射接口，
// MyBatis会根据这个接口的全限定名去寻找SQL映射文件中的SQL映射
@Mapper
public interface UserDao {
    void insertUser(User user);

    List<User> selectUserAll();
    User selectUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
