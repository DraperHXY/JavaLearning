package com.draper.Thread;

/**
 * Created by Draper_HXY 03/06/2018 5:34 PM
 * Email: Draper_HXY@163.com
 */
public class MoreBasicThread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
    }

}
