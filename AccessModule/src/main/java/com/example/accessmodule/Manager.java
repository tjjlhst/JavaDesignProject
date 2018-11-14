package com.example.accessmodule;

import java.util.Random;

public class Manager extends Staff {


    public Manager(String aName) {
        super(aName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducer(){
        return new Random().nextInt()*10;
    }


}
