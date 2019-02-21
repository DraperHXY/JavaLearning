package com.draper.design_pattern.observer;

public class Wolf extends Subject {

    public void invade() {
        System.out.println("灰太狼：我要搞事情了");
        notifyObserver();
    }

}
