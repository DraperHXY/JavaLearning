package com.draper.pojo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private static final long serialVersionUID = 1l;

    private transient int id;
    private String name;
    private Date bornDate;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    private long age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void study(){
        System.out.println(id + " 正在学习");
    }
}
