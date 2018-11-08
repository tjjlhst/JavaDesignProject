package com.example.decoratormodule;

public class Client {

    public static void main(String[] args){

//        构造被装饰的组件对象
        Component component = new ConCreteComponent();

//        根据组件对象构造装饰对象A并调用，此时相当于给组件对象添加
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operator();

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operator();

    }

}
