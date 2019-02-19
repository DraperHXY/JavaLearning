package com.draper;

import com.draper.pojo.Student;
import com.draper.pojo.coffee.Coffee;
import com.draper.pojo.coffee.Mocha;
import com.draper.pojo.coffee.MyMocha;
import com.draper.pojo.coffee.MyMochaInterface;

public class instanceofTest {

    public static void main(String[] args) {
        Coffee coffee = new MyMocha();

        if (coffee instanceof Coffee){
            System.out.println(true);
        }

        if (coffee instanceof  Mocha){
            System.out.println(true);
        }

        if (coffee instanceof  MyMocha){
            System.out.println(true);
        }

        if (coffee instanceof MyMochaInterface){
            System.out.println(true);
        }
    }

}
