package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadC extends ThreadB {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }

}
