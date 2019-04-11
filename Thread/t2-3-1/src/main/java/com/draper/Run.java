package com.draper;

/**
 * @author draper_hxy
 */
public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();

        new Thread(printStringService).start();

        System.out.println("停止！" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);

    }

}
