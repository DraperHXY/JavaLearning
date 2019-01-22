package com.draper.chao;

import com.draper.pojo.Student;

import javax.xml.bind.Marshaller;
import java.util.Date;

public class ObjectTest {

    private Student student;

    {
        student.getAge();
        new Marshaller.Listener(){
            @Override
            public void beforeMarshal(Object source) {

            }

            @Override
            public void afterMarshal(Object source) {

            }
        };
        System.out.println(1);
    }

    public static void main(String[] args) {

        Object o = new Object(){
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

//        System.out.println(o.equals(new Student()));

        short a = 128;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);


        int c = Integer.parseInt("1024");
        int d = Integer.valueOf("1024").intValue();

        Student s = new Student(){
            @Override
            public String getName() {
                return "aa";
            }
        };

        s.setBornDate(new Date());
        System.out.println(s.getName());
    }

}
