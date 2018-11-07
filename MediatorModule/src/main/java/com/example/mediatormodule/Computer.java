package com.example.mediatormodule;


public abstract class Computer {

    public String getmBoard() {
        return mBoard;
    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public String getmDisplay() {
        return mDisplay;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmOS() {
        return mOS;
    }

    public void setmOS(String os) {
        if(os == null || os.equals("")){
            this.mOS = "MacOS";
        } else {
            this.mOS = os;
        }
    }

    @Override
    public String toString() {
        return "mBoard:" + mBoard + ",mDisplay:" + mDisplay + ",OS:" + mOS;
    }

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {

    }

}