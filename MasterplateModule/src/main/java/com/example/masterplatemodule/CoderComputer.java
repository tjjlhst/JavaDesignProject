package com.example.masterplatemodule;

public class CoderComputer extends AbstractComputer {


    @Override
    protected void login() {
        super.login();
        System.out.println();
        System.err.println("程序员只要验证密码和名字就行了");
    }




}
