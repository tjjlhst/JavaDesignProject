package com.example.bridgemodule;

//抽象部分
public abstract class Abstraction {

    public Implementor mImplementor;  //声明一个私有成员变量引用实现部分的对象


    public Abstraction(Implementor mImplementor){
        this.mImplementor = mImplementor;
    }

    public void operation(){
        mImplementor.operationImpl();
    }

    private Implementor mImplementor() {
        return null;
    }


}
