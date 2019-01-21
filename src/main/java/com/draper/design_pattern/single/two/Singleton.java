package com.draper.design_pattern.single.two;

/**
 * 懒加载，线程安全，但是效率低下，每次获取实例
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
