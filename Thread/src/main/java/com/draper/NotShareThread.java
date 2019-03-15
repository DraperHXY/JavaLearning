package com.draper;

/**
 * @author draper_hxy
 */
public class NotShareThread extends Thread {

    private int count = 5;

    public NotShareThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println("由 " + getName() + " 计算， count = " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        NotShareThread threadA = new NotShareThread("A");
        NotShareThread threadB = new NotShareThread("B");
        NotShareThread threadC = new NotShareThread("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }

}
