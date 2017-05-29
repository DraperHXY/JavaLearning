package com.draper;

import com.draper.pojo.Student;
import org.junit.Assert;
import org.junit.Test;

public class HolderTest {

    @Test
    public void testConstructor() {
        Student student = new Student();
        student.setName("Draper");
        Holder<Student> holder = new Holder<Student>(student);
        Assert.assertEquals("Draper", holder.get().getName());
    }

}
