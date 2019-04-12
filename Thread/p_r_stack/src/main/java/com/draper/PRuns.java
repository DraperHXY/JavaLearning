package com.draper;

/**
 * 多生产一消费
 *
 * @author draper_hxy
 */
public class PRuns {

    public static void main(String[] args) {
        Object lock = new Object();
        P p1 = new P(lock);
        P p2 = new P(lock);
        P p3 = new P(lock);
        P p4 = new P(lock);
        P p5 = new P(lock);
        C c1 = new C(lock);
        C c2 = new C(lock);
        C c3 = new C(lock);
        C c4 = new C(lock);
        C c5 = new C(lock);

        new ThreadP(p1).start();
        new ThreadP(p2).start();
        new ThreadP(p3).start();
        new ThreadP(p4).start();
        new ThreadP(p5).start();
        new ThreadC(c1).start();
        new ThreadC(c2).start();
        new ThreadC(c3).start();
        new ThreadC(c4).start();
        new ThreadC(c5).start();






    }

}
