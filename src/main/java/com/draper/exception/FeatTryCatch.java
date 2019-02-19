package com.draper.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class FeatTryCatch {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new StringReader("fileC.txt"))) {
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
