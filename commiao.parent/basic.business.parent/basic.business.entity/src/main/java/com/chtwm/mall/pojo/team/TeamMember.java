package com.chtwm.mall.pojo.team;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class TeamMember  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 团队成员
     */
    private Long id;
    /**
     * 团队ID
     */
    private Long teamId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 头像
     */
    private String logo;
    /**
     * 职位
     */
    private String job;
    /**
     * 简介
     */
    private String introduce;
    /**
     * 排列序号
     */
    private Integer serialNumber;
    /**
     * 状态 0禁用 1启用
     */
    private Integer enables;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 修改人ID
     */
    private Long updateId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    
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
     *teamId的setter方法
     **/     
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
     /**
     *teamId的getter方法
     **/ 
    public Long getTeamId() {
        return this.teamId;
    }
    
    /**
     *name的setter方法
     **/     
    public void setName(String name) {
        this.name = name;
    }
     /**
     *name的getter方法
     **/ 
    public String getName() {
        return this.name;
    }
    
    /**
     *logo的setter方法
     **/     
    public void setLogo(String logo) {
        this.logo = logo;
    }
     /**
     *logo的getter方法
     **/ 
    public String getLogo() {
        return this.logo;
    }
    
    /**
     *job的setter方法
     **/     
    public void setJob(String job) {
        this.job = job;
    }
     /**
     *job的getter方法
     **/ 
    public String getJob() {
        return this.job;
    }
    
    /**
     *introduce的setter方法
     **/     
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
     /**
     *introduce的getter方法
     **/ 
    public String getIntroduce() {
        return this.introduce;
    }
    
    /**
     *serialNumber的setter方法
     **/     
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
     /**
     *serialNumber的getter方法
     **/ 
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
     *enables的setter方法
     **/     
    public void setEnables(Integer enables) {
        this.enables = enables;
    }
     /**
     *enables的getter方法
     **/ 
    public Integer getEnables() {
        return this.enables;
    }
    
    /**
     *createId的setter方法
     **/     
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
     /**
     *createId的getter方法
     **/ 
    public Long getCreateId() {
        return this.createId;
    }
    
    /**
     *updateId的setter方法
     **/     
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
     /**
     *updateId的getter方法
     **/ 
    public Long getUpdateId() {
        return this.updateId;
    }
	public String getCreateTimeString() {
	  return DateUtils.formatDateToString(getCreateTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreateTimeString(String createTimeStr) {
	  setCreateTime(DateUtils.parse(createTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createTime的setter方法
     **/     
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
     /**
     *createTime的getter方法
     **/ 
    public Date getCreateTime() {
        return this.createTime;
    }
	public String getUpdateTimeString() {
	  return DateUtils.formatDateToString(getUpdateTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdateTimeString(String updateTimeStr) {
	  setUpdateTime(DateUtils.parse(updateTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updateTime的setter方法
     **/     
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
     /**
     *updateTime的getter方法
     **/ 
    public Date getUpdateTime() {
        return this.updateTime;
    }
/**
 * 创建人名称
 */
private String createName;
/**
 * 修改人名称
 */
private String updateName;
    
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
}