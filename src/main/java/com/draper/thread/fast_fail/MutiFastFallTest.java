package com.draper.thread.fast_fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutiFastFallTest {

    private static List<Integer> list = new ArrayList<>();

    /*
    当一个线程正在遍历 list，另外一个线程对这个线程进行结构性修改则导致抛出异常
     */
    public static void main(String[] args) {

        list.add(1);
        list.add(2);
        list.add(3);

        Thread ergodic = new Thread(() -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print("线程1\t");
                System.out.print(iterator.next() + "\t");
                printAll();
            }
        });


        Thread modify = new Thread(() -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print("线程2\t");
                System.out.print(iterator.next() + "\t");
//                iterator.remove();
                printAll();
            }
        });

        ergodic.start();
        modify.start();

    }

    private static void printAll() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }


}
