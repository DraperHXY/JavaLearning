package com.draper.generic;

import com.draper.pojo.Student;
import com.draper.pojo.coffee.Cappuccino;
import com.draper.pojo.coffee.Coffee;

public class Holder<T> {
    private T t;

    public void setHolder(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }


    public static void main(String[] args) {
        Holder<Student> holder = new Holder<>();
        holder.setHolder(new Student());
        Student student = holder.getT();

        Holder<Coffee> holder1 = new Holder<>();
        Coffee coffee = new Cappuccino();
        holder1.setHolder(coffee);
        Cappuccino cappuccino = (Cappuccino) holder1.getT();
        System.out.println(cappuccino);

    }
}
