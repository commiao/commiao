package com.chtwm.mall.pojo.sfactivity;

import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

public class ActivityOrderExt extends ActivityOrder {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 活动规模
     */
    private String scale;
    /**
     * 活动地点
     */
    private String address;
    
    /**
     * 活动时间
     */
    private Date startDate;
    
    
    /**
     * 活动主题
     */
    private String theme;

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public String getStartDateString() {
        return DateUtils.formatDateToString(getApplyTime(), "yyyy-MM-dd HH:mm:ss");
      }
      public void setStartDateString(String applyTimeStr) {
        setStartDate(DateUtils.parse(applyTimeStr, "yyyy-MM-dd HH:mm:ss"));
      }
    
}
