package com.chtwm.mall.pojo.communityActivitiesEnroll;

import java.io.Serializable;

/**
 * CreateDate:2017年7月07日
 * @Description: 恒乐会社区活动报名Bean
 * @author:chenglong
 */
public class CommunityActivityEnrollParam  implements Serializable  {
    
    private static final long serialVersionUID = -5529074696727682803L;
    /**
     * 社区活动Id
     */
    private String communityActId;
    /**
     * 姓名
     */
    private String custName;
    /**
     * 手机号
     */
    private String phone;
    public String getCommunityActId() {
        return communityActId;
    }
    public void setCommunityActId(String communityActId) {
        this.communityActId = communityActId;
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
    @Override
    public String toString() {
        return "CommunityActivityEnrollParam [communityActId=" + communityActId + ", custName=" + custName + ", phone=" + phone + "]";
    }
    
}