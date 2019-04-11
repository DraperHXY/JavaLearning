package com.draper;

/**
 * @author draper_hxy
 */
public class Test {

    public static void main(String[] args) {

        try {
            Object lock = new Object();
            // t1 持有锁并 wait
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            // t2
            MyThread2 t2 = new MyThread2(lock);
            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
