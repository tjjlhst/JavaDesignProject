package com.example.compositemodule;

import java.util.List;


/*
* 表示文件的类
*
* */
public class File extends Dir {

    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持此类型操作");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持此类型操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持此类型操作");
    }

    @Override
    public void print() {
        System.out.print("这是一个文件："+getName());
    }

    @Override
    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持此类型操作");
    }
}
