package com.draper.design_pattern.single.three;

public class Singleton {

    // volatile 禁止指令重排序
    private volatile static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {                        // single check
            synchronized (Singleton.class) {
                if (singleton == null) {                // double check
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

    }


}
