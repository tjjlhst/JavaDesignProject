package com.example.masterplatemodule;

//模版化模式的实例化
public class Test {

    public static void main(String[] args){
        AbstractComputer comp = new CoderComputer();

        comp.startUp();

        comp = new MilitaryComputer();

        comp.startUp();

    }


}
