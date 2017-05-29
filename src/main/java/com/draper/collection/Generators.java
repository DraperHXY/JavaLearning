package com.draper.collection;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < n; i++) {
            set.add(gen.next());

        }
        return set;
    }

    public static <T> Map<Integer, T> fill(Map<Integer, T> map, Generator<T> gen, int n) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < n; i++) {
            map.put(i,gen.next());
        }
        return map;
    }

}
