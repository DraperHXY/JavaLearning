package com.draper.generic;

import com.draper.pojo.School;
import com.draper.pojo.Student;
import com.draper.pojo.coffee.Coffee;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    public static void main(String[] args) {
        ThreeTuple threeTuple = new ThreeTuple<Student,Coffee,School>(new Student(),new Coffee(),new School());
        System.out.println(threeTuple.third);
    }

}
