package com.draper.classload;

import com.draper.pojo.Curry;

public class FinalNBA {
    public static void main(String args[]) {
        Curry curry = new Curry();
        curry.setSmallName("small student");
        printAll(curry);
        System.out.println(curry);
    }


    public static void printAll(final Curry temp) {
        temp.setSmallName("fk do it");
        System.out.println(temp.getSmallName());
//		temp = new Curry();  //传送进来的Curry引用是final，不可以再赋值了，这里一定会报错哦！
    }

}
