package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB(); // 只有一个 bService，但是 b 没有 start, b.start 会 sleep

            ThreadA a = new ThreadA(b); // a start.run 里面会让 b.start

            a.start();
            // a.start.run 会让 b.start
            System.out.println("main: " + System.currentTimeMillis());
            Thread.sleep(1000);// 先阻塞 1000ms
            // main.sleep 1000
            // a.run sleep 6000
            // b.start
            // b.run print begin
            // b.sleep 5000ms
            // b.run print end

            ThreadC c = new ThreadC(b); // c.start 会执行 b.service
            c.start();
            // b.service print


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
