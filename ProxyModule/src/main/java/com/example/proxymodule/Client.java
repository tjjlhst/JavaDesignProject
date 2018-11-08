package com.example.proxymodule;


//客户类

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args){

        System.out.println("\n静态代理的结果");
//        静态代理
//        构造一个小明
        ILowsuit xiaomin = new XiaoMin();
//        构造一个代理律师并将小明作为构造参数传递进去
        ILowsuit lawyer = new Lawyer(xiaomin);
//        提起诉讼
        lawyer.submit();
//        进行举证
        lawyer.burden();
//        维护
        lawyer.defend();
//        完成诉讼
        lawyer.finish();

        System.out.println("\n动态代理的结果：");
//      动态代理
        ILowsuit xiaohong = new XiaoMin();
        DynamicProxy proxy = new DynamicProxy(xiaohong);

//        取代被代理类小明的classloader
        ClassLoader classLoader = xiaohong.getClass().getClassLoader();
//        动态构造一个代理律师
        ILowsuit iLowsuit = (ILowsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILowsuit.class},proxy);

        iLowsuit.submit();
        iLowsuit.burden();
        iLowsuit.defend();
        iLowsuit.finish();



    }

}
