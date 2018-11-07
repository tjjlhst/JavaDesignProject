package com.example.bridgemodule;


//  桥接模式，实例调用
public class Client {

    public static void main(String[] args){

        Implementor a = new ConcreteImplementorA();
        Implementor b = new ConcreteImplementorB();

        RefinedAbstraction abstractionA = new RefinedAbstraction(a);
        abstractionA.refindOperation();

        RefinedAbstraction abstractionB = new RefinedAbstraction(b);
        abstractionB.refindOperation();


    }

}
