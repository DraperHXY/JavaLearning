package com.draper;

/**
 * @author draper_hxy
 */
public class ShareThread extends Thread {

    private int count = 5;

    @Override
    public void run() {
        count--;
        System.out.println("由 " + getName() + " 计算， count = " + count);
    }

    public static void main(String[] args) {
        ShareThread shareThread = new ShareThread();

        // 同一个线程交给其他不同的线程来访问
        Thread threadA = new Thread(shareThread, "A");
        Thread threadB = new Thread(shareThread, "B");
        Thread threadC = new Thread(shareThread, "C");
        Thread threadD = new Thread(shareThread, "D");
        Thread threadE = new Thread(shareThread, "E");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }

}
