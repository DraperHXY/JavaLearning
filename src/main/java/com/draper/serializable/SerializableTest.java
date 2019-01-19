package com.draper.serializable;

import com.draper.pojo.Student;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

public class SerializableTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小米");

        Calendar calendar = new Calendar.Builder().build();
        calendar.set(1997,6,23);
        student.setBornDate(calendar.getTime());

        student.setId(1);

        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };




    }





}
