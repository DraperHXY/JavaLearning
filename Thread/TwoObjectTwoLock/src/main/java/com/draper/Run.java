package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        MyObject o = new MyObject();

        ThreadA threadA = new ThreadA(o);
        ThreadB threadB = new ThreadB(o);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }

}
