package com.draper.reflect;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        // 获取类加载器
        ClassLoader loader = Thread.currentThread().getContextClassLoader();


        // =================== 创建 userObj 学生对象 ====================
        // 通过类加载器获取这个 类(Class) 对象
        Class userClazz = loader.loadClass("com.draper.reflect.User");

        Object userObj = userClazz.newInstance();

//        Field usernameField = userClazz.getField("username");//get 公有属性
        Field usernameField = userClazz.getDeclaredField("username");//get 所有属性

        //因为是私有方法，要修改必须先设置为可访问
        usernameField.setAccessible(true);
        usernameField.set(userObj, "小明");



        // =================== 创建 classRoomObj 班级对象 ===============
        Class roomClazz = loader.loadClass("com.draper.reflect.ClassRoom");
        Object classRoomObj = roomClazz.newInstance();



        // ==========  创建 ArrayList 对象，这对象是班级的一个私有属性 ============
        Class arrayListClazz = loader.loadClass("java.util.ArrayList");
        Object arrayListObj = arrayListClazz.newInstance();

        // 调用 arrayListObj.add 方法添加 userObj
        Method addMethod = arrayListClazz.getMethod("add", Object.class);
        addMethod.invoke(arrayListObj, userObj);

        // 将这个 arrayListObj 注入到 classRoomObj 对象中
        Field userListField = roomClazz.getDeclaredField("userList");
        userListField.setAccessible(true);
        userListField.set(classRoomObj, arrayListObj);

        // 调用 classRoomObj 的方法 study
        Method studyMethod = roomClazz.getMethod("study");
        studyMethod.setAccessible(true);
        studyMethod.invoke(classRoomObj);
    }

}
