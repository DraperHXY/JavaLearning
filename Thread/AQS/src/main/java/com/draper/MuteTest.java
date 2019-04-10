package com.draper;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author draper_hxy
 */
public class MuteTest {

    private static CyclicBarrier barrier = new CyclicBarrier(31);
    private static int a = 0;
    private static Mute mute = new Mute();

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {


        // 对每个线程自增 10000 次，同步正常的话，最终的结果应该为 300000
        // 未加锁前
        for (int i = 0; i < 30; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increment2(); // 没有同步措施的 ++a;
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        barrier.await();

        System.out.println("加锁前, a = " + a);

        barrier.reset(); // 重置 CyclicBarrier

    }

    public static void increment1() {
        a++;
    }

    public static void increment2() {
        mute.lock();
        a++;
        mute.unlock();
    }

}
