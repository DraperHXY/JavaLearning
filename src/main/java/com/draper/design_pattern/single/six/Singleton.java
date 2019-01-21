package com.draper.design_pattern.single.six;

public enum Singleton {
    INSTANCE
}

class Test{
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
    }
}

