package com.draper.list;

import com.draper.test.RandomTestData;
import org.junit.Test;

public class RandomListTest {

    @Test
    public void test() {
        RandomList<String> list = new RandomList<String>();
        for (String s : RandomTestData.str) {
            System.out.println("add: " + s);
            list.add(s);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get());
        }
    }

}
