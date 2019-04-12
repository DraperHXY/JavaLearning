package com.draper;

/**
 * 普通一生产，多消费
 *
 * @author draper_hxy
 */
public class Runs {

    public static void main(String[] args) {
        Object lock = new Object();
        P p = new P(lock);
        C c1 = new C(lock);
        C c2 = new C(lock);
        C c3 = new C(lock);
        C c4 = new C(lock);
        C c5 = new C(lock);
        ThreadP pThread = new ThreadP(p);
        pThread.start();

        ThreadC c1Thread = new ThreadC(c1);
        ThreadC c2Thread = new ThreadC(c2);
        ThreadC c3Thread = new ThreadC(c3);
        ThreadC c4Thread = new ThreadC(c4);
        ThreadC c5Thread = new ThreadC(c5);

        c1Thread.start();
        c2Thread.start();
        c3Thread.start();
        c4Thread.start();
        c5Thread.start();


    }

}
