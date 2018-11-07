package com.draper.collection.iterator;

import com.draper.collection.Generator;

public class Fib implements Generator<Integer> {

    private int count = 0;

    private int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    @Override
    public Integer next() {

        return fib(count++);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Generator<Integer> generator = new Fib();
        for (int i = 0; i < 18; i++) {
            System.out.println(generator.next());
        }
    }
}
