package com.draper.thread;

import java.lang.ref.ReferenceQueue;

/**
 * Created by Draper_HXY 03/06/2018 5:14 PM
 * Email: Draper_HXY@163.com
 */
public class LiftOff implements Runnable {

    protected int countDown = 10; // 控制的并发量，默认为 10
    private static int taskCount = 0; // 计数器
    private final int id = taskCount++; // 每次初始化一个 LiftOff 都会自动 + 1

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }

    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield(); // 让步，但不保证肯定
        }
    }

}
