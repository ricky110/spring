package com.huawei.it.spring;

/**
 * @Author: Ricky
 * @Date: 2019-08-06 22:44
 */
public class MainApp {
    public static void main(String[] args) {
        // 直接调用目标方法中的目标方法  没有使用代理
        C c = new C();
        c.test();

        MyProxyInterface mpi = (MyProxyInterface) new MyProxyUtil(new C()).getProxy();
        mpi.test();
        System.out.println(mpi);
    }
}
