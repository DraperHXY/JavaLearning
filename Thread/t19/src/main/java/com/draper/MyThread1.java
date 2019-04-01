package com.draper;

import java.util.Random;

/**
 * @author draper_hxy
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★★★★★ Thread1 use time = " + (endTime - beginTime));


    }
}
