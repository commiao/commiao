package com.chtwm.mall.pojo.faceId;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class RecordFaceIdentification  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 注册手机号
     */
    private String loginPhone;
    /**
     * 客户姓名
     */
    private String custName;
    /**
     * 身份证号（加掩码）
     */
    private String idNo;
    /**
     * 身份证号加密串
     */
    private String encryptIdNo;
    /**
     * 图像类型（1.ocr 2.活体图像 3.公安部截图）
     */
    private String imgType;
    /**
     * ocr身份证图像路径
     */
    private String ocrImgUrl;
    /**
     * 活体图像路径
     */
    private String livingImgUrl;
    /**
     * 公安部截图路径
     */
    private String policeImgUrl;
    /**
     * 对比分数
     */
    private Integer contrastRatio;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 修改人ID
     */
    private Long updateId;

    
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
     *custNo的setter方法
     **/     
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
     /**
     *custNo的getter方法
     **/ 
    public String getCustNo() {
        return this.custNo;
    }
    
    /**
     *loginPhone的setter方法
     **/     
    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }
     /**
     *loginPhone的getter方法
     **/ 
    public String getLoginPhone() {
        return this.loginPhone;
    }
    
    /**
     *custName的setter方法
     **/     
    public void setCustName(String custName) {
        this.custName = custName;
    }
     /**
     *custName的getter方法
     **/ 
    public String getCustName() {
        return this.custName;
    }
    
    /**
     *idNo的setter方法
     **/     
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
     /**
     *idNo的getter方法
     **/ 
    public String getIdNo() {
        return this.idNo;
    }
    
    /**
     *encryptIdNo的setter方法
     **/     
    public void setEncryptIdNo(String encryptIdNo) {
        this.encryptIdNo = encryptIdNo;
    }
     /**
     *encryptIdNo的getter方法
     **/ 
    public String getEncryptIdNo() {
        return this.encryptIdNo;
    }
    
    /**
     *imgType的setter方法
     **/     
    public void setImgType(String imgType) {
        this.imgType = imgType;
    }
     /**
     *imgType的getter方法
     **/ 
    public String getImgType() {
        return this.imgType;
    }
    
    /**
     *ocrImgUrl的setter方法
     **/     
    public void setOcrImgUrl(String ocrImgUrl) {
        this.ocrImgUrl = ocrImgUrl;
    }
     /**
     *ocrImgUrl的getter方法
     **/ 
    public String getOcrImgUrl() {
        return this.ocrImgUrl;
    }
    
    /**
     *livingImgUrl的setter方法
     **/     
    public void setLivingImgUrl(String livingImgUrl) {
        this.livingImgUrl = livingImgUrl;
    }
     /**
     *livingImgUrl的getter方法
     **/ 
    public String getLivingImgUrl() {
        return this.livingImgUrl;
    }
    
    /**
     *policeImgUrl的setter方法
     **/     
    public void setPoliceImgUrl(String policeImgUrl) {
        this.policeImgUrl = policeImgUrl;
    }
     /**
     *policeImgUrl的getter方法
     **/ 
    public String getPoliceImgUrl() {
        return this.policeImgUrl;
    }
    
    /**
     *contrastRatio的setter方法
     **/     
    public void setContrastRatio(Integer contrastRatio) {
        this.contrastRatio = contrastRatio;
    }
     /**
     *contrastRatio的getter方法
     **/ 
    public Integer getContrastRatio() {
        return this.contrastRatio;
    }
    
    /**
     *remark的setter方法
     **/     
    public void setRemark(String remark) {
        this.remark = remark;
    }
     /**
     *remark的getter方法
     **/ 
    public String getRemark() {
        return this.remark;
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


}