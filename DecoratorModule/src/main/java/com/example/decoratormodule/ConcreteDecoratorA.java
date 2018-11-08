package com.example.decoratormodule;


/*
* 抽象抽象具体类
*
* */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component mComponent) {
        super(mComponent);
    }

    @Override
    public void operator() {
        operatorA();

        super.operator();

        operatorB();
    }


    public void operatorA(){
        System.out.println("ConcreteDecoratorA的operatorA");
    }

    public void operatorB(){
        System.out.println("ConcreteDecoratorA的operatorB");
    }

}
