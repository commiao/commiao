package com.chtwm.mall.pojo.communityActivitiesEnroll;

import java.io.Serializable;

/**
 * CreateDate:2017年7月07日
 * @Description: 恒乐会社区活动报名结果Bean
 * @author:chenglong
 */
public class CommunityActivityEnrollResult  implements Serializable  {

    private static final long serialVersionUID = -626232172192481922L;
    /**
     * id
     */
    private String id;
    /**
     * 社区活动Id
     */
    private String communityActId;
    /**
     * 报名时间
     */
    private String enrollTime;
    /**
     * 姓名
     */
    private String custName;
    /**
     * 手机号
     */
    private String phone;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCommunityActId() {
        return communityActId;
    }
    public void setCommunityActId(String communityActId) {
        this.communityActId = communityActId;
    }
    public String getEnrollTime() {
        return enrollTime;
    }
    public void setEnrollTime(String enrollTime) {
        this.enrollTime = enrollTime;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}