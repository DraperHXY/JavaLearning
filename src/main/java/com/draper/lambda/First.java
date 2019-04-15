package com.draper.lambda;

/**
 * @author draper_hxy
 */
public class First {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello lambda");

        new Thread(runnable).start();

    }

}
