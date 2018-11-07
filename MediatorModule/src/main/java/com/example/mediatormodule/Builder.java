package com.example.mediatormodule;

//抽象builder类
public abstract class Builder {

/*//    设置主机
    public abstract void buildBoard(String board);
//    设置显示器
    public abstract void buildDisplay(String display);
//    设置操作系统
    public abstract void buildOs();*/

    //    设置主机
    public abstract Builder buildBoard(String board);
    //    设置显示器
    public abstract Builder buildDisplay(String display);
    //    设置操作系统
    public abstract Builder buildOs(String os);

    public abstract Computer create();

}
