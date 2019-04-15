package com.draper.lambda.functional;

/**
 * @author draper_hxy
 */
@FunctionalInterface
public interface FunctionalDemo<R, T> {

    R apply(T t);

}
