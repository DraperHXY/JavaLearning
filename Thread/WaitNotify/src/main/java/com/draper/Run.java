package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread a = new ThreadA(lock);
        Thread b = new ThreadB(lock);
        a.start();
        b.start();
    }

}
