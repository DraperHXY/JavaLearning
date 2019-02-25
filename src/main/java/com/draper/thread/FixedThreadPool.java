package com.draper.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Draper_HXY 03/06/2018 5:40 PM
 * Email: Draper_HXY@163.com
 */
public class FixedThreadPool {

    public static void main(String[] args) {

        // newFixedThreadPool 作为一个定长线程池，可以控制最大并发量，超出的数量则等待。
        ExecutorService exec = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
