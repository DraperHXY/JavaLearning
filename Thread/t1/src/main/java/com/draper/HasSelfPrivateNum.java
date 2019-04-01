package com.draper;

/**
 * @author draper_hxy
 */
public class HasSelfPrivateNum {

    public void addI(String username) {
        int num = 0;
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println("num = " + num);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
