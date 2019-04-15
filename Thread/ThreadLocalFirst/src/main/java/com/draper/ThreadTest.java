package com.draper;

/**
 * @author draper_hxy
 */
public class ThreadTest {

    public static void main(String[] args) {
        AIncrease a = new AIncrease();

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    a.print();
                }

            }).start();
        }
    }

}
