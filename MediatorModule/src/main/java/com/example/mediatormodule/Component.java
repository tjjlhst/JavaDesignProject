package com.example.mediatormodule;

public abstract class Component {


    protected String name;  //节点名

    public Component(String name){
        this.name = name;
    }

//    具体方法让子类实现
    public abstract void doSomething();


}
