package com.draper.design_pattern.general;

/**
 * @author draper_hxy
 */
public interface GeneralBeanTypeHandler<T> {

    void decorate(T t, GeneralInfo generalInfo);

}
