package com.huawei.it.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Ricky
 * @Date: 2019-08-06 22:45
 */

// 定义一个代理工具类并实现一个接口InvocationHandler这个接口提供了一个动态代理统一调用方法invoke
public class MyProxyUtil implements InvocationHandler {

    private Object target; // 定义目标对象  定义成object类型是为了更好的通用性

    public MyProxyUtil(Object target) {
        this.target = target;
    }

    // 获取代理对象
    public Object getProxy() {
        // 使用Proxy对象来创建动态代理
        // 参数1 为目标对象的类加载器
        // 参数2 为目标对象的所有父接口
        // 参数3 为InvocationHandler接口的对象，目的是为了通知JVM当前创建的代理对象中的任何方法被调用时需要执行那个类中的invoke方法
        //       当指定当前类的对象作为参数3的值，目的当前这个代理对象中的方法被调用时要执行当前类中的invoke方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * invoke 方法是动态代理的统一调用方法，这个方法不能也不需要手动调用，当我们调用代理对象的任何一个方法时
     * JVM都会自动的执行这个invoke方法
     *
     * @param proxy  动态代理对象，这个对象有JVM自动创建
     * @param method 动态代理对象被调用的方法
     * @param args   动态代理对象被调用的方法的实参
     * @return 返回目标方法的一个具体的返回值
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理对象---执行目标方法前");
        Object result = method.invoke(target, args);
        System.out.println("动态代理对象---执行目标方法后");
        return result;
    }
}
