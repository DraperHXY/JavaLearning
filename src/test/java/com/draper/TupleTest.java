package com.draper;

import com.draper.pojo.School;
import com.draper.pojo.Student;
import org.junit.Test;

public class TupleTest {

    @Test
    public void testTuple(){
        TwoTuple t = new TwoTuple<Student,School>(new Student(), new School());
        TwoTuple<School,Student> a;
        t
                = new TwoTuple<Student,School>(new Student(),new School());
    }
}
