package com.example.accessmodule;

//访问基类
public interface Visitor {

//    访问工程师类
    public void visit(Engineer engineer);

//    访问经理类型
    public void visit(Manager manager);

}
