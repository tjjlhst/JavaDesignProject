package com.example.decoratormodule;


/*
* 抽象抽象具体类
*
* */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component mComponent) {
        super(mComponent);
    }

    @Override
    public void operator() {
        operatorA();

        super.operator();

        operatorB();
    }


    public void operatorA(){
        System.out.println("ConcreteDecoratorB的operatorA");
    }

    public void operatorB(){
        System.out.println("ConcreteDecoratorB的operatorB");
    }

}
