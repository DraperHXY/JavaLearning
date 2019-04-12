package com.draper;

/**
 * 普通一生产一消费
 *
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        Object lock = new Object();
        P p = new P(lock);
        C c= new C(lock);
        new ThreadP(p).start();
        new ThreadC(c).start();
    }

}
