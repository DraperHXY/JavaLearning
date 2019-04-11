package com.draper;

/**
 * @author draper_hxy
 */
public class MyObject {

    public synchronized void methodA(){
        try {
            System.out.println("begin methodA at thread: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
