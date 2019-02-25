package com.draper.classload;

import com.draper.pojo.Student;

public class BlockFirst {

    private Student student = getStudentInitializer();

    // final 防止初始化函数被覆盖
    private final Student getStudentInitializer(){
        return new Student();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Student student = new BlockFirst().student;
            System.out.println(student);
        }
    }

}
