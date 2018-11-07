package com.example.bridgesimplemodule;

public abstract class Coffee {


    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl){
        this.impl = impl;
    }

//    咖啡具体是什么样子的由子类实现
    public abstract void makeCoffee();


}
