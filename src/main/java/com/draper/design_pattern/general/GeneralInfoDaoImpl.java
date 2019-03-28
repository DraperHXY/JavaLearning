package com.draper.design_pattern.general;

/**
 * @author draper_hxy
 */
public class GeneralInfoDaoImpl implements GeneralInfoDao {

    @Override
    public int insertGeneralInfoDao(GeneralInfo generalInfo) {
        System.out.println("插入数据 generalInfo id = " + generalInfo.getId());
        return 0;
    }

}
