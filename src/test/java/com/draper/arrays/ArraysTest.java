package com.draper.arrays;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void test1() {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);
        int[] a3= {5,1,2,3,6,9,8,4,7,0};
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.binarySearch(a3, 2));
    }

}
