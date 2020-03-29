package com.huawei.it.spring;

/**
 * @Author: Ricky
 * @Date: 2019-08-06 22:30
 */
public class MainApp {
    public static void main(String[] args) {
        // 直接调用我们的类 如果C类不能满足我们的需求 我们不能或者不想修改C类中的代码 我们可以考虑
        // 使用代理模式，我们去调用代理对象的方法，然后代理帮助我们调用目标对象C中的方法
        C c = new C();
        c.test();

        MyProxyInterface mpi = new MyProxy();
        mpi.test();
    }
}
