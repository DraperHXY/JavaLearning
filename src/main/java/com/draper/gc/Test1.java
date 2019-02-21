package com.draper.gc;

public class Test1 {

    class A {
        public Object o;
    }

    class B {
        public Object o;
    }

    void method(){
        A a = new A();
        B b = new B();
        a.o = b;
        b.o = a;
        a = null;
        b = null;
    }

    public static void main(String[] args) {
        new Test1().method();
    }

}

