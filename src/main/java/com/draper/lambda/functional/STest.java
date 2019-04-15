package com.draper.lambda.functional;

import java.util.function.Supplier;

/**
 * @author draper_hxy
 */
public class STest {

    public static void main(String[] args) {

        Supplier<String> s = () -> "hello";

        SupplierDemo<String> ss = () -> "hello ss";
    }

}
