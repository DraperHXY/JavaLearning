package com.draper;

/**
 * @author draper_hxy
 */
public class C {

    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = ValueObject.value;
                System.out.println("get 的值为 " + value);
                ValueObject.value = "";
                lock.notify();
                Thread.sleep(5000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
