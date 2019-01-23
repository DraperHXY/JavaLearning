package com.draper.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * LRU 最久未使用
 * Least recently used
 *
 * @param <k>
 * @param <v>
 */
public class LRUCache<k, v> extends LinkedHashMap<k, v> {

    private static final int MAX_ELEMENT = 3;

    public LRUCache() {

        // 开启 LRU, 否则删除算法从头删除
        super(MAX_ELEMENT, 0.75F, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {

        // 如果当前 size 超过容量，则开始执行是否删除
        Boolean result = size() > MAX_ELEMENT;
        return result;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>();
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        System.out.println(cache.keySet());
    }


}
