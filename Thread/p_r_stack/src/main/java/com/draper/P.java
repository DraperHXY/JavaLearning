package com.draper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author draper_hxy
 */
public class P {

    public static List list = new ArrayList();

    private Object lock;

    public P(Object lock) {
        this.lock = lock;
    }

    public void prod() {
        try {
            synchronized (lock) {
                while (list.size() >= 1) {
                    lock.wait();
                }
                list.add(System.currentTimeMillis() + "_" + System.nanoTime());
                System.out.println(Thread.currentThread().getName() + "开始生产: " + list.size());
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + "唤醒消费线程");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
