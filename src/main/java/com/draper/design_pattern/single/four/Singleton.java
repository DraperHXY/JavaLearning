package com.draper.design_pattern.single.four;

/**
 * 急加载，线程安全
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
