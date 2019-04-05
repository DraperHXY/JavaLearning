package com.draper.reflect;

import lombok.Data;
import lombok.ToString;

/**
 * @author draper_hxy
 */
@ToString
@Data
public class User {

    private Long id;
    private String username;
    private String password;

    public void study(){
        System.out.println(username + " having study now");
    }

}
