package com.example.flyweightmodule;

import java.util.Random;

public class TrainTicket implements Ticket {

    public String from; //发给地
    public String to;  //目的地
    public String bunk;  //铺位
    public int price; //价格

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        System.out.println("买到的位置为：" + bunk);
    }

    public void showTicket(String bunk) {
        price = new Random().nextInt() * 1000;
        System.out.println("购买从" + from + "到" + to + "的" + bunk + "火车票,价格：" + price);
    }


}
