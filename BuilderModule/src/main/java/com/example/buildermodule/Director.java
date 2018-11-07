package com.example.buildermodule;


//
public class Director {

    Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String board,String display){
//        builder.buildBoard(board);
//        builder.buildDisplay(display);
//        builder.buildOs();

//        director角色被省略，buider的setter()方法中返回this即可
        builder
                .buildOs("")
                .buildBoard(board)
                .buildDisplay(display);

        System.out.println(builder.create().toString());
    }


}
