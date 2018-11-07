package com.example.bridgemodule;


//优化抽象部分
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor mImplementor) {
        super(mImplementor);
    }

    public void refindOperation(){
//        对Abstraction中的方法进行扩展
        mImplementor.operationImpl();
        System.out.println("RefinedAbstraction的refindOperation()方法");
    }
}
