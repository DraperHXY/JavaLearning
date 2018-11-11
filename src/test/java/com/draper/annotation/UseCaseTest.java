package com.draper.annotation;

import org.junit.Test;

import java.lang.reflect.Method;


public class UseCaseTest {


    @Test
    public void trackTest() {
        for (Method declaredMethod : StartAnnotation.class.getDeclaredMethods()) {
            MyAnnotation myAnnotation = declaredMethod.getAnnotation(MyAnnotation.class);
            if (myAnnotation != null) {
                System.out.println(myAnnotation.id() + "\t" + myAnnotation.description());
            }
        }
    }



}