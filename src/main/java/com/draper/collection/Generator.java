package com.draper.collection;

public interface Generator<T> {

    T next() throws IllegalAccessException, InstantiationException;

}
