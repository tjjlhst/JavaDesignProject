package com.example.buildermodule;

//具体的builder，继承自
public class MacbookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOs(String os) {
        mComputer.setmOS(os);
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }


}
