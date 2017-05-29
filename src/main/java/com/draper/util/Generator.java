package com.draper.util;

public interface Generator<T> {

    T next() throws IllegalAccessException, InstantiationException;
}
