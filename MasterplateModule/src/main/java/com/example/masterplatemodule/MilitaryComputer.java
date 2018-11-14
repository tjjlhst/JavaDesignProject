package com.example.masterplatemodule;

public class MilitaryComputer extends AbstractComputer {


    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.err.println("检查硬件的防火墙");
    }

    @Override
    protected void login() {
        System.err.println("请用指纹进行验证");
    }
}
