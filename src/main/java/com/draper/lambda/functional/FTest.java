package com.draper.lambda.functional;

/**
 * @author draper_hxy
 */
public class FTest {

    public static void main(String[] args) {
        FunctionalDemo<Integer, String> fdd = Integer::valueOf;
        int hello = fdd.apply("12345");
        System.out.println(hello);

        FunctionalDemo<Integer, String> fd = (String s) -> Integer.valueOf(s);

        System.out.println(fd.apply("456989213"));
    }

}
