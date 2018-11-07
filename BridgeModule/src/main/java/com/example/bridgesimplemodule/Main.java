package com.example.bridgesimplemodule;

//桥接模式，实例调用
public class Main {

    public static void main(String[] args){

//        原汁原味
        Ordinary implOrdinary = new Ordinary();

//        准备糖类
        Sugar implSugar = new Sugar();

        LargeCoffee largeCoffee = new LargeCoffee(implOrdinary);
        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee = new SmallCoffee(implOrdinary);
        smallCoffee.makeCoffee();

        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        SmallCoffee smallCoffeeSuger = new SmallCoffee(implSugar);
        smallCoffeeSuger.makeCoffee();

    }

}
