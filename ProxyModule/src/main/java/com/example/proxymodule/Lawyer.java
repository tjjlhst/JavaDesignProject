package com.example.proxymodule;


//代理律师类

public class Lawyer implements ILowsuit {

    private ILowsuit iLowsuit;

    public Lawyer(ILowsuit iLowsuit){
        this.iLowsuit  = iLowsuit;
    }

    @Override
    public void submit() {
        iLowsuit.submit();
    }

    @Override
    public void burden() {
        iLowsuit.burden();
    }

    @Override
    public void defend() {
        iLowsuit.defend();
    }

    @Override
    public void finish() {
        iLowsuit.finish();
    }

}
