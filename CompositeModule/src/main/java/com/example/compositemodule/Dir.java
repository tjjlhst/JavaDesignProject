package com.example.compositemodule;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {

    /*
    * 声明一个list成员变量存储文件夹下的所有元素
    *
    * */
    protected List<Dir> dirs = new ArrayList<>();

    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    * 添加一个文件或文件夹
    *
    * */
    public abstract void addDir(Dir dir);

    /*
    * 移除一个文件夹
    *
    * */
    public abstract void removeDir(Dir dir);

    /*
    * 清除文件夹下的所有元素
    *
    * */
    public abstract void clear();

    /*
    * 输入文件夹下所有元素
    *
    * */
    public abstract void print();

    /*
    * 获取文件或文件名
    *
    * */
    public abstract List<Dir> getFiles();


}
