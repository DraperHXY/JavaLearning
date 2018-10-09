package com.draper.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Draper_HXY 03/06/2018 6:03 PM
 * Email: Draper_HXY@163.com
 */
public class Task implements Callable<String>{

    private int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    private int sleepTime;

    public Task(int sleepTime){
        this.sleepTime = sleepTime;
    }


    public void run() {
        try {
            System.out.println("#" + id + "开始运行");
            System.out.println("#" + id + "休眠" + sleepTime);
            Thread.sleep(sleepTime);
            System.out.println("#" + id + "结束休眠");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Random random = new Random(47);

        for (int i = 0; i < 5; i++) {
            int sleepTime = random.nextInt(10000) + 1000;
//            exec.execute(new Task(sleepTime));

        }
        exec.shutdown();
    }

    public String call() throws Exception {
        Thread.sleep(sleepTime);
        return id + "\t" + sleepTime;
    }
}
