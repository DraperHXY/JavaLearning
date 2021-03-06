package com.draper.design_pattern.observer;

public class PleasantSheep implements Observer {

    @Override
    public String getName() {
        return "喜羊羊";
    }

    @Override
    public void update(String msg) {
        System.out.println("喜羊羊收到通知:" + msg);
    }

}
