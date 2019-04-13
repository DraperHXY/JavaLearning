package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            System.out.println("B\t" + Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("B\t" + Thread.currentThread().getName() + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
