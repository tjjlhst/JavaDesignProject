package com.example.accessmodule;

import java.util.Random;

public class Engineer extends Staff {


    public Engineer(String aName) {
        super(aName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt()*10000;
    }

}
