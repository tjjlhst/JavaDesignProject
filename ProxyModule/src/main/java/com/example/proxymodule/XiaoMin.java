package com.example.proxymodule;

public class XiaoMin implements ILowsuit {

    ILowsuit mIlowsuit;  //持有一个具体被代理者的引用

//    public Lawyer

    @Override
    public void submit() {
        System.out.println("提起诉讼");
    }

    @Override
    public void burden() {
        System.out.println("提交证据");
    }

    @Override
    public void defend() {
        System.out.println("辩护");
    }

    @Override
    public void finish() {
        System.out.println("出结果");
    }
}
