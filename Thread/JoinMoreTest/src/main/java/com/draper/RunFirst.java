package com.draper;

/**
 * @author draper_hxy
 */
public class RunFirst {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);

        a.start(); // a 抢着锁
//        Thread.sleep(5000);
        b.start(); // b 没抢着

        System.out.println("main" + System.currentTimeMillis());
    }

}
