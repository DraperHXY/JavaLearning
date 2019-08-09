package com.draper;

/**
 * @author draper_hxy
 */
public class TestMyClassLoader {

    public static void main(String[] args)
        throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader mcl = new MyClassLoader();
        Class c1 = Class.forName("com.draper.Person", true, mcl);
        Object obj = c1.newInstance();
        System.out.println(obj);
        System.out.println(obj.getClass().getClassLoader());

    }

}
