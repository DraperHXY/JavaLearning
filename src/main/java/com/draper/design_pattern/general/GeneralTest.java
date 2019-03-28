package com.draper.design_pattern.general;

/**
 * @author draper_hxy
 */
public class GeneralTest {

    public static void main(String[] args) {

        MyInfo myInfo = new MyInfo();
        myInfo.setId("1");
        myInfo.setGetWatAccount("11");

        GeneralInfoDao generalInfoDao = new GeneralInfoDaoImpl();
        generalInfoDao.insertGeneralInfoDao(new GeneralInfo((info, generalInfo) -> {
            generalInfo.setId(Long.valueOf(info.getId()));
            generalInfo.setAccountId(Long.valueOf(info.getGetWatAccount()));
        }, myInfo));
    }

}
