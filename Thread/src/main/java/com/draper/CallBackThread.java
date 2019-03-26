package com.draper;


/**
 * @author draper_hxy
 */
public class CallBackThread implements Runnable{
    private CallbackListener listener;

    public CallBackThread(CallbackListener listener){
        this.listener = listener;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
            listener.callback("current Thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CallbackListener callbackListener = new CallbackListener() {
            @Override
            public void callback(Object data) throws InterruptedException {
                System.out.println(data);
            }
        };

        Thread thread = new Thread(new CallBackThread(callbackListener));
        thread.start();
    }

}
