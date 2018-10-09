package com.draper.thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Draper_HXY 03/06/2018 5:49 PM
 * Email: Draper_HXY@163.com
 */
public class TaskWithResult implements Callable<String> {

    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }

    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }

    private static class CallableDemo{
        public static void main(String[] args) {
            Random random = new Random(47);

            ExecutorService exec = Executors.newCachedThreadPool();
            ArrayList<Future<String>> futures = new ArrayList<Future<String>>();

            for (int i = 0; i < 10; i++) {
                int sleepTime = random.nextInt(10000) + 1000;
                futures.add(exec.submit(new Task(sleepTime)));
            }

            for (Future<String> future : futures) {
                if (!future.isDone()) {
                    System.out.println("未结束");
                }
                try {
                    System.out.println(future.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } finally {
                    exec.shutdown();
                }
            }
        }
    }
}
