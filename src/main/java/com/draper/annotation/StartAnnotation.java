package com.draper.annotation;

/**
 * 使用注解
 */
public class StartAnnotation {

    @MyAnnotation(id = "47", description = "passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
}
