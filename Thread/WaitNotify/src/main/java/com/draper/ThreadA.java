package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {

            synchronized (lock) {
                if (MyList.getSize() != 5) {
                    System.out.println("begin wait " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("end wait " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
