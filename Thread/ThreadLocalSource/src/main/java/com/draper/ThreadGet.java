package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadGet {

    public static void main(String[] args) {
        ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> 11);
        System.out.println(integerThreadLocal.get());
        ThreadLocal<Integer> integerThreadLocal1 = ThreadLocal.withInitial(() -> 22);
        System.out.println(integerThreadLocal.get());
        System.out.println(integerThreadLocal.get());
        System.out.println(integerThreadLocal1.get());

        integerThreadLocal.remove();
        System.out.println(integerThreadLocal.get());

        new ThreadLocal<Integer>().set(1);


    }

}
