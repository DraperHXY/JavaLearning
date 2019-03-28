package com.draper.design_pattern.general;

import java.util.Date;

/**
 * @author draper_hxy
 */
public class MyInfo {

    private String id;
    private String getWayId;
    private String getWatAccount;
    private String subsetId;
    private String subsetAccount;
    private Date collectTime;
    private String order;
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGetWayId() {
        return getWayId;
    }

    public void setGetWayId(String getWayId) {
        this.getWayId = getWayId;
    }

    public String getGetWatAccount() {
        return getWatAccount;
    }

    public void setGetWatAccount(String getWatAccount) {
        this.getWatAccount = getWatAccount;
    }

    public String getSubsetId() {
        return subsetId;
    }

    public void setSubsetId(String subsetId) {
        this.subsetId = subsetId;
    }

    public String getSubsetAccount() {
        return subsetAccount;
    }

    public void setSubsetAccount(String subsetAccount) {
        this.subsetAccount = subsetAccount;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
