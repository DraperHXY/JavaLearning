package com.draper.pojo;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private Date bornDate;

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
