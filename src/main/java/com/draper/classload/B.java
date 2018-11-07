package com.draper.classload;

public class B {
    public B() {
        System.out.println(((A) this).a);
    }
}