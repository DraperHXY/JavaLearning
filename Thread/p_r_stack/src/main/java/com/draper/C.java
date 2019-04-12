package com.draper;

/**
 * @author draper_hxy
 */
public class C {

    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }

    public void consume() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "现在已有: " + P.list.size());
                while (P.list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + "开始等待");
                    lock.wait(); // 调用 wait 要小心，因为随时可能有线程在 wait 后被唤醒
                    System.out.println(Thread.currentThread().getName() + "已被唤醒");
                }
                System.out.println(Thread.currentThread().getName() + "开始消费: " + P.list.size());
                P.list.remove(0);
                lock.notifyAll();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
