package com.example.compositemodule;

public class Client {

    public static void main(String[] args){

        
//        构造一个
        Dir diskC = new Folder("c");

//        c盘目录下有子文件a
        diskC.addDir(new File("test.txt"));

//        创建三个文件夹
        Dir dirA = new Folder("A");
        dirA.addDir(new File("testA.txt"));
        diskC.addDir(dirA);

        Dir dirB = new Folder("B");
        dirB.addDir(new File("testB.txt"));
        diskC.addDir(dirB);

        Dir dirC = new Folder("D");
        dirC.addDir(new File("textD.txt"));
        diskC.addDir(dirC);

        diskC.print();

//        perfLogs目录
        Dir dirPerf = new Folder("perfLogs");
    }

}
