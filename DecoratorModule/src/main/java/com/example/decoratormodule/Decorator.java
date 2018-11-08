package com.example.decoratormodule;


/*
* 抽象装饰者
*
* */
public class Decorator extends Component {


    public Component mComponent;  //持有一个component对象引用

    public Decorator(Component mComponent) {
        this.mComponent = mComponent;
    }


    @Override
    public void operator() {
        mComponent.operator();
    }



}
