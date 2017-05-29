package com.draper.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {

    private List<T> list = new ArrayList<T>();
    private Random random = new Random(47);

    public void add(T t){
        list.add(t);
    }

    public T get(){
        return list.get(random.nextInt(list.size()));
    }


}
