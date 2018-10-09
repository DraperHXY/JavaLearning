package com.draper.thread;

/**
 * Created by Draper_HXY 03/06/2018 5:32 PM
 * Email: Draper_HXY@163.com
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for liftOff");
    }
}
