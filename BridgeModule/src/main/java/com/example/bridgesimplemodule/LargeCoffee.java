package com.example.bridgesimplemodule;

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯" + impl.addSomething() + "咖啡");
    }

}
