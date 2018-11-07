package com.draper.collection.iterator;

import java.util.Iterator;

public class IteratorFib extends Fib implements Iterable<Integer> {

    private int count;
    public IteratorFib(int count) {
        this.count =count;
    }


    public static void main(String[] args) {
        Iterator<Integer> iterator = new IteratorFib(18).iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Override
    public Integer next() {
        return super.next();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (count < 0){
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Integer next() {
                count--;
                return IteratorFib.this.next();
            }
        };
    }
}
