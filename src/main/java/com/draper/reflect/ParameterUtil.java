package com.draper.reflect;

import com.draper.pojo.Student;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterUtil {

    public static Method[] getMethods(Class clazz){
        return clazz.getMethods();

    }

    /**
     * 若要获取到具体的参数名，需在 Java compiler 中添加 -parameters 参数，以便打印出来的参数名称不是 arg0 arg1
     * @param args
     */
    public static void main(String[] args) {
        Method[] methods = ParameterUtil.getMethods(Student.class);
        for (Method method : methods) {
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("method = " + method.getName() + ",parameterType = " + parameter.getType() + ",parameterName = " + parameter.getName());
            }
        }
    }


}
