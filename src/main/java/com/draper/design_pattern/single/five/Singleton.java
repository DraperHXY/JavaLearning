package com.draper.design_pattern.single.five;

/**
 * 静态内部类 懒加载
 */
public class Singleton {

    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }


}
