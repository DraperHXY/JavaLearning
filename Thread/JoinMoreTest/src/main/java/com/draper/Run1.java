package com.draper;

/**
 * @author draper_hxy
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);

        a.start(); // a 抢着锁
//        Thread.sleep(5000);
        b.start(); // b 没抢着
        b.join(2000);

        System.out.println("main" + System.currentTimeMillis());
    }

}
