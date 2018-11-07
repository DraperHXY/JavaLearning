package com.draper.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 实现一个 List 集合中随机获取一个对象
 * 内部采用 ArrayList 和 random 实现
 *
 * @param <T>
 */
public class RandomList<T> {

    private List<T> list = new ArrayList<T>();
    private Random random = new Random();

    public void add(T t){
        list.add(t);
    }

    public T get(){
        return list.get(random.nextInt(list.size()));
    }

}
