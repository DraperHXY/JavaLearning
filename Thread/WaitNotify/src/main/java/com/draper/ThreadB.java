package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10 && MyList.getSize() <= 10; i++) {
                    MyList.add();
                    if (MyList.getSize() == 5){
                        lock.notify();
                        System.out.println("以发出通知");
                    }
                    System.out.println("添加了一个对象");
                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
