package com.draper.thread;

/**
 * Created by Draper_HXY 03/06/2018 5:30 PM
 * Email: Draper_HXY@163.com
 */
public class MainThread {

    public static void main(String[] args) {
        LiftOff launch = new LiftOff(15);
        launch.run();
    }
}
