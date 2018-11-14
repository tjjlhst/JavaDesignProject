package com.example.masterplatemodule;

public abstract class AbstractComputer {

//    抽象的computer
    protected void powerOn(){
        System.err.println("开启电源");
    }

//     硬件检查
    protected void checkHardware(){
        System.err.println("硬件检查");
    }

//     导入操作系统
    protected void loadOS(){
        System.err.println("加载操作系统");
    }

//      登录
    protected void login(){
        System.err.println("直接登录系统");
    }

//    启动计算机方法，步骤固定为开启电源、系统检查、加载操作系统、用户登录。该方法定义为final，防止算法框架被复写
    public final void  startUp(){
        System.err.println("关机");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.err.println("关机end");
    }

}
