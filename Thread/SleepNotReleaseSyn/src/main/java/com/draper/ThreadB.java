package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("b run begin: " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end: " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("b service timer = " + System.currentTimeMillis());
    }

}
