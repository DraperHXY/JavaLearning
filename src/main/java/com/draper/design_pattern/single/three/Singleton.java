package com.draper.design_pattern.single.three;

public class Singleton {

    // volatile 禁止指令重排序
    private volatile static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {// single check

            System.out.println(".");

            synchronized (Singleton.class) {
//                if (singleton == null) {                // double check
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleton = new Singleton();
//                }
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return singleton;
    }

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        }).start();




    }


}
