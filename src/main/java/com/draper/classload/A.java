package com.draper.classload;

public class A extends B {
    public int a = 100;

    public A() {
        System.out.println(a);
        a = 200;
    }

    public static void main(String[] args) {
        System.out.println(new A().a);
    }
}