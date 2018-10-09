package com.draper.reflect;

import com.draper.pojo.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentReflect {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.draper.pojo.Student");
        Student student = (Student) clazz.newInstance();

//        Field idField = clazz.getField("id");//get 公有属性
        Field idField = clazz.getDeclaredField("id");//get 私有属性

        //因为是私有方法，要修改必须先设置为可访问
        idField.setAccessible(true);
        idField.set(student, 110);

        Method studyMethod = clazz.getMethod("study");//get 公有方法
//        Method studyMethod = clazz.getDeclaredMethod("study");//get 私有方法

        //因为 study 是 public 所以访问默认是 true
//        studyMethod.setAccessible(true);
        studyMethod.invoke(student);

    }

}
