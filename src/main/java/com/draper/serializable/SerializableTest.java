package com.draper.serializable;

import com.draper.pojo.Student;

import java.io.*;
import java.util.*;

public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("小米");

        Calendar calendar = new Calendar.Builder().build();
        calendar.set(1997, 6, 23);
        student.setBornDate(calendar.getTime());

        student.setId(11);

//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fileC.txt"));
//        out.writeObject(student);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("fileC.txt"));
        Student student1 = (Student) in.readObject();
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getId());

    }

}
