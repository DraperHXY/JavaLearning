package com.draper;


/**
 * @author draper_hxy
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
