package com.draper.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Draper_HXY 03/06/2018 5:37 PM
 * Email: Draper_HXY@163.com
 */
public class CashThreadPool {

    public static void main(String[] args) {

        // 一般情况下使用线程都会推荐使用线程池，而并非一个线程
        // newCachedThreadPool 可缓存线程池，有空闲的则回收使用，无空闲的则新建一个线程
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
