package com.draper.lambda.functional;



/**
 * @author draper_hxy
 */
public class CTest {

    public static void main(String[] args) {
        CustomerDemo<String> cd = System.out::println;

        cd.accept("123456");
    }

}
