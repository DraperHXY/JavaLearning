package com.draper;

/**
 * @author draper_hxy
 */
public class SynShareThread extends Thread {

    private int count = 5;

    @Override
    // 加锁
    public synchronized void run() {
        count--;
        System.out.println("由 " + getName() + " 计算， count = " + count);
    }

    public static void main(String[] args) {
        SynShareThread synShareThread = new SynShareThread();

        // 同一个线程交给其他不同的线程来访问
        Thread threadA = new Thread(synShareThread, "A");
        Thread threadB = new Thread(synShareThread, "B");
        Thread threadC = new Thread(synShareThread, "C");
        Thread threadD = new Thread(synShareThread, "D");
        Thread threadE = new Thread(synShareThread, "E");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }

}
