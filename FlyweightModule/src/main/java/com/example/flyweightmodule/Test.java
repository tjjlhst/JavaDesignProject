package com.example.flyweightmodule;

public class Test {

    public static void main(String[] args){

        Ticket ticket1 = TicketFactory.getTick("北京","深圳");
        ticket1.showTicketInfo("上铺");

//        Ticket ticket2 = TicketFactory.getTick("北京","深圳");
        ticket1.showTicketInfo("下铺");

//        Ticket ticket3 = TicketFactory.getTick("北京","深圳");
        ticket1.showTicketInfo("中铺");


    }

}
