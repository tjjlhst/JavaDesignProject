package com.example.accessmodule;


import java.util.Random;

/*
* 员工基类
*
* */
public abstract class Staff {

    public String name;

    public int kpi;

    public Staff(String aName){
        this.name = aName;
        this.kpi = new Random().nextInt();
    }

//    接受visitor的访问
    public abstract void accept(Visitor visitor);


}
