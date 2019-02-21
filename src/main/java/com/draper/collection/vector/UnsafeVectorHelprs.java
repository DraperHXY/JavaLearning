package com.draper.collection.vector;

import java.util.Vector;

public class UnsafeVectorHelprs {

    public static void main(String[] args) {
        // 初始化Vector
        Vector<String> vector = new Vector();
        vector.add("关注公众号");
        vector.add("Java3y");
        vector.add("买Linux可到我下面的链接，享受最低价");
        vector.add("给3y加鸡腿");

        // 这样也会有线程安全的问题
        for (int i = 0; i < vector.size(); i++) {
//             比如在这执行vector.clear();
            new Thread(() -> vector.clear()).start();
            System.out.println(vector.get(i));
        }

        // 在遍历前加锁
        synchronized (vector) {
            vector.forEach(s -> new Thread(() -> vector.clear()).start());
        }
    }

    // 得到Vector最后一个元素
    public static Object getLast(Vector list) {
        synchronized (list) {
            int lastIndex = list.size() - 1;
            return list.get(lastIndex);
        }
    }

    // 删除Vector最后一个元素
    public static void deleteLast(Vector list) {
        synchronized (list) {
            int lastIndex = list.size() - 1;
            list.remove(lastIndex);
        }
    }

}
