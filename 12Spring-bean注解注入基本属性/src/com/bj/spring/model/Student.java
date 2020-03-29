package com.bj.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Ricky
 * @Date: 2019-08-03 14:14
 */
@Component("student")
@Scope("prototype")
public class Student {
    @Value("1")
    private Long id;
    @Value("张三")
    private String name;
    @Value("23")
    private Integer age;

    //默认根据名字进行自动注入 如果没有找到对象名字那么将根据类型进行自动装配 如果类型也不存在则注入失败 会报异常
    @Resource
    private Classes classes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
