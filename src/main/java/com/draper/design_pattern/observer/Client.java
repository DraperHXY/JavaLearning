package com.draper.design_pattern.observer;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Wolf wolf = new Wolf();
        Observer pleasantSheep = new PleasantSheep();
        wolf.attach(pleasantSheep);
        Thread.sleep(2000);
        wolf.invade();
    }

}
