package com.huawei.it.spring;

/**
 * @Author: Ricky
 * @Date: 2019-08-06 22:44
 */
public class C implements MyProxyInterface {
    @Override
    public void test() {
        System.out.println("这是C类中的test方法");
    }
}
