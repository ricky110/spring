package com.huawei.it.spring.dao;

import com.huawei.it.spring.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Ricky
 * @Date: 2019-08-11 14:27
 */
@Mapper
//ybatis 的一个注解 这个注解标志着当前的接口是一个SQL映射接口，MyBatis
// 会根据这个接口的全限定名去寻找SQL映射文件中的SQL映射
public interface UserDao {


    void insertUser(User user);
}
