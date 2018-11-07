package com.example.mediatormodule;

public class Test {

    public static void main(String[] args){
        Builder builder = new MacbookBuilder();
        builder.buildDisplay("15.5寸").buildBoard("LCD面板").buildOs("windows");
        System.out.println(builder.create().toString());

        new Director(new MacbookBuilder()).construct("液晶面板","13.3寸");

    }

}
