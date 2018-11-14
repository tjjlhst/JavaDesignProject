package com.example.accessmodule;

//调用类
public class Client {

    public static void main(String[] args){
        BusinessReport report = new BusinessReport();
        System.out.println("给CEO看的报表");
//        设置ceo，访问者
        report.showReport(new CEOVisitor());
        System.out.println("给CTO看的报表");
//        设置cto，另一个访问者
        report.showReport(new CTOVisitor());

    }


}
