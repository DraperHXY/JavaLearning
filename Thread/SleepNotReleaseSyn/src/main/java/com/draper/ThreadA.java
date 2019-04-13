package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB threadB) {
        super();
        this.b = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
