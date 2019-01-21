package com.draper.collection.map.tree_map;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest1 {


    public static void main(String[] args) {
        new TreeMapTest1().test();
    }

    private void test() {
        TreeMap<Student, String> treeMap = new TreeMap<>();
        Student student1 = new Student(12);
        Student student2 = new Student(11);
        Student student3 = new Student(45);
        Student student4 = new Student(82);
        Student student5 = new Student(66);

        System.out.println(student1 + "\thashCode = " + student1.hashCode());
        System.out.println(student2 + "\thashCode = " + student2.hashCode());
        System.out.println(student3 + "\thashCode = " + student3.hashCode());
        System.out.println(student4 + "\thashCode = " + student4.hashCode());
        System.out.println(student5 + "\thashCode = " + student5.hashCode());

        treeMap.put(student1, "小米12");
        treeMap.put(student2, "小米11");
        treeMap.put(student3, "小米45");
        treeMap.put(student4, "小米82");
        treeMap.put(student5, "小米66");

        System.out.println(treeMap.size());

        Set<Map.Entry<Student,String>> entries = treeMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }

    private class Student implements Comparable<Student> {

        private int age;

        public int getAge() {
            return age;
        }

        public Student(int age) {
            this.age = age;
        }

//        @Override
//        public int hashCode() {
//            System.out.println("getAge = " + getAge());
//            return getAge();
//        }


        //        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) {
//                return true;
//            }
//            return this.getAge() == ((Student) obj).getAge() ? true : false;
//        }
//

        // https://bbs.csdn.net/topics/390794140
        // TreeMap 的 key 的唯一性是通过 compareTo 这个接口来实现的
        @Override
        public int compareTo(Student o) {
            int num = this.age - o.getAge();
            //为0时候，两者相同：
            if (num == 0) {
                return 0;
                //大于0时，传入的参数小：
            } else if (num > 0) {
                return 1;
                //小于0时，传入的参数大：
            } else {
                return -1;
            }
        }
    }

}
