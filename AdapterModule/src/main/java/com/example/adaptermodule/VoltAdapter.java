package com.example.adaptermodule;

//adapter角色，直接把220v换成5v
public class VoltAdapter extends Volt220 implements FiveVolt {


    Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt220() {
        return volt220.Volt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }



}
