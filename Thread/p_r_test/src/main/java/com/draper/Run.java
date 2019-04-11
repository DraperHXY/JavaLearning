package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        Thread pThread = new ThreadP(p);
        pThread.start();
        Thread cThread = new ThreadC(c);
        cThread.start();

    }

}
