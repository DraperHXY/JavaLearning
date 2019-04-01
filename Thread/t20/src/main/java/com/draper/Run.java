package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我离开 thread 对象也不打印了，也是就是停止！");
    }

}
