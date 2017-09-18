package com.chtwm.mall.pojo.sfactivity;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ActivityOrder  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 注册人手机号
     */
    private String mobileNoInternet;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 活动ID
     */
    private String activityId;
    /**
     * 活动名称
     */
    private String activityName;
    /**
     * 预约状态(默认成功 1)
     */
    private String status;
    /**
     * 预约时间
     */
    private Date applyTime;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;

    
    /**
     *id的setter方法
     **/     
    public void setId(Long id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public Long getId() {
        return this.id;
    }
    
    /**
     *mobileNoInternet的setter方法
     **/     
    public void setMobileNoInternet(String mobileNoInternet) {
        this.mobileNoInternet = mobileNoInternet;
    }
     /**
     *mobileNoInternet的getter方法
     **/ 
    public String getMobileNoInternet() {
        return this.mobileNoInternet;
    }
    
    /**
     *userName的setter方法
     **/     
    public void setUserName(String userName) {
        this.userName = userName;
    }
     /**
     *userName的getter方法
     **/ 
    public String getUserName() {
        return this.userName;
    }
    
    /**
     *activityId的setter方法
     **/     
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
     /**
     *activityId的getter方法
     **/ 
    public String getActivityId() {
        return this.activityId;
    }
    
    /**
     *activityName的setter方法
     **/     
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
     /**
     *activityName的getter方法
     **/ 
    public String getActivityName() {
        return this.activityName;
    }
    
    /**
     *status的setter方法
     **/     
    public void setStatus(String status) {
        this.status = status;
    }
     /**
     *status的getter方法
     **/ 
    public String getStatus() {
        return this.status;
    }
	public String getApplyTimeString() {
	  return DateUtils.formatDateToString(getApplyTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setApplyTimeString(String applyTimeStr) {
	  setApplyTime(DateUtils.parse(applyTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *applyTime的setter方法
     **/     
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
     /**
     *applyTime的getter方法
     **/ 
    public Date getApplyTime() {
        return this.applyTime;
    }
	public String getInserttimeString() {
	  return DateUtils.formatDateToString(getInserttime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setInserttimeString(String inserttimeStr) {
	  setInserttime(DateUtils.parse(inserttimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *inserttime的setter方法
     **/     
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
     /**
     *inserttime的getter方法
     **/ 
    public Date getInserttime() {
        return this.inserttime;
    }
	public String getUpdatetimeString() {
	  return DateUtils.formatDateToString(getUpdatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdatetimeString(String updatetimeStr) {
	  setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updatetime的setter方法
     **/     
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
     /**
     *updatetime的getter方法
     **/ 
    public Date getUpdatetime() {
        return this.updatetime;
    }


}