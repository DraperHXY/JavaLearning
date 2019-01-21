package com.draper.design_pattern.single.one;

/**
 * 懒加载，线程不安全
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() throws InterruptedException {
        if (singleton == null) {

            // 500ms 内的线程全部卡在这个地方
            Thread.sleep(500);
            singleton = new Singleton();
        }
        return singleton;
    }


    public static void main(String[] args) {

        // 模拟线程不安全
        new Thread(() -> {
            try {
                System.out.println(Singleton.getInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(200);
                System.out.println(Singleton.getInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println(Singleton.getInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(400);
                System.out.println(Singleton.getInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
