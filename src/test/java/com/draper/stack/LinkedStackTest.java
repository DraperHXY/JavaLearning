package com.draper.stack;

import com.draper.pojo.Student;
import org.junit.Test;

public class LinkedStackTest {

    @Test
    public void test(){
        LinkStack<Student> stack = new LinkStack<Student>();
        for (String s : "今天 好 好 开心 心 心心 啊".split(" ")) {
            Student student = new Student();
            student.setName(s);
            stack.push(student);
        }
        Student s;
        while ((s = stack.pop()) != null) {
            System.out.println(s.getName());
        }
    }

}
