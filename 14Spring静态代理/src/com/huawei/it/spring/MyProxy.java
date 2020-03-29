package com.huawei.it.spring;

/**
 * @Author: Ricky
 * @Date: 2019-08-06 22:35
 */
// 自定义的静态代理对象，这个对象必须要实现和目标对象所实现的相同的接口
public class MyProxy implements MyProxyInterface {

    private C c = new C();//定义目标对象

    @Override
    public void test() {
        System.out.println("自定义的代理对象----执行目标方法前");
        c.test();// 在代理对象的代理方法中调用目标对象中的同名方法
        System.out.println("自定义的代理对象----执行目标方法后");
    }
}
