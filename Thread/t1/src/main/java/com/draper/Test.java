package com.draper;

/**
 * @author draper_hxy
 */
public class Test {

    private int count = 0;

    private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final Test test = new Test();
        // 创建两个线程，执行 add() 操作
        Thread th1 = new Thread(() -> {
            test.add10K();
        });
        Thread th2 = new Thread(() -> {
            test.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        System.out.println(test.count);
        th2.join();
        System.out.println(test.count);
        return test.count;
    }



    public static void main(String[] args) {
//        new Thread(() -> {
//            try {
//                System.out.println(calc());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
        System.out.println(3 | 9);
    }


}
