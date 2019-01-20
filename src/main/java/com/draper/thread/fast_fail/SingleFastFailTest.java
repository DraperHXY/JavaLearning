package com.draper.thread.fast_fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingleFastFailTest {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);

        printAll();

    }


    private static void printAll() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            // 集合的 remove 操作，将会抛出 ConcurrentModificationException
            list.remove(2);

            // 迭代器的 remove 操作
//            iterator.remove();
        }

    }

}
