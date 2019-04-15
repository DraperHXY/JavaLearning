package com.draper;

/**
 * @author draper_hxy
 */
public class AIncrease {

    private int num = 0;

    public int increase() {
        num++;
        return num;
    }

    public void print() {
        System.out.println(Thread.currentThread().getName() + "\t" + increase());
    }

}
