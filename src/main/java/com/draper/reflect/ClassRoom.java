package com.draper.reflect;

import lombok.Data;

import java.util.List;

/**
 * @author draper_hxy
 */
@Data
public class ClassRoom {

    private List<User> userList;

    public void study(){
        userList.forEach(user -> user.study());
    }

}
