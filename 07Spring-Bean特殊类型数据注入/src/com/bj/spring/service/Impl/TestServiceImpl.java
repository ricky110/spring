package com.bj.spring.service.Impl;


import com.bj.spring.model.Student;
import com.bj.spring.service.TestService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: Ricky
 * @Date: 2019-07-07 10:18
 */
public class TestServiceImpl implements TestService {

    private String[] strArray;
    private List<Student> studentList;
    private Set<Student> studentSet;
    private Map<String,Student> studentMap;
    private Properties properties;

    @Override
    public void test() {
        System.out.println("数组数据开始");
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("数组数据结束");
        System.out.println("-------------");
        System.out.println("List数据开始");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("List数据结束");
        System.out.println("-------------");
        System.out.println("Set数据开始");
        for (Student s : studentSet) {
            System.out.println(s);
        }
        System.out.println("Set数据结束");
        System.out.println("-------------");
        System.out.println("Map数据开始");
        for (String s : studentMap.keySet()) {
            System.out.println("key: "+s+"  value:"+studentMap.get(s));
        }
        System.out.println("Map数据结束");
        System.out.println("-------------");
        System.out.println("Properties数据开始");
        for (String key : properties.stringPropertyNames()) {
            System.out.println("key: "+key+"  value:"+properties.getProperty(key));
        }
        System.out.println("Propertie数据结束");

    }

    public String[] getStrArray() {
        return strArray;
    }

    public void setStrArray(String[] strArray) {
        this.strArray = strArray;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
