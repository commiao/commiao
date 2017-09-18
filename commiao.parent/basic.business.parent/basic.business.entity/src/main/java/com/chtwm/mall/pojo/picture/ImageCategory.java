package com.chtwm.mall.pojo.picture;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.entity.htjf.enums.GloalEnumType;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ImageCategory  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 类型
     */
    private String category;
    /**
     * 类型描述
     */
    private String categoryDesc;
    /**
     * 建议尺寸（宽）
     */
    private Integer width;
    /**
     * 建议尺寸（高）
     */
    private Integer height;
    /**
     * 建议大小
     */
    private Integer size;
    /**
     * 大小类型
     */
    private String sizeType;
    /**
     * 格式
     */
    private String categoryFormat;
    /**
     * 多个格式
     */
    private String[] categoryFormats;
    /**
     * 描述
     */
    private String description;
    
    /**
     * 0 无效 1有效
     */
    private Integer status = GloalEnumType.Status.NORMAL.getValue();
    /**
     * 
     */
    private Date createtime;
    /**
     * 
     */
    private Date updatetime;

    private Long createId;
	private Long updateId;
	private String createName;
	private String updateName;
    
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
     *category的setter方法
     **/     
    public void setCategory(String category) {
        this.category = category;
    }
     /**
     *category的getter方法
     **/ 
    public String getCategory() {
        return this.category;
    }
    
    /**
     *width的setter方法
     **/     
    public void setWidth(Integer width) {
        this.width = width;
    }
     /**
     *width的getter方法
     **/ 
    public Integer getWidth() {
        return this.width;
    }
    
    /**
     *height的setter方法
     **/     
    public void setHeight(Integer height) {
        this.height = height;
    }
     /**
     *height的getter方法
     **/ 
    public Integer getHeight() {
        return this.height;
    }
    
    /**
     *size的setter方法
     **/     
    public void setSize(Integer size) {
        this.size = size;
    }
     /**
     *size的getter方法
     **/ 
    public Integer getSize() {
        return this.size;
    }
    
    /**
     *sizeType的setter方法
     **/     
    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }
     /**
     *sizeType的getter方法
     **/ 
    public String getSizeType() {
        return this.sizeType;
    }
    
    /**
     *categoryFormat的setter方法
     **/     
    public void setCategoryFormat(String categoryFormat) {
        this.categoryFormat = categoryFormat;
    }
     /**
     *categoryFormat的getter方法
     **/ 
    public String getCategoryFormat() {
        String[] categoryFormats = getCategoryFormats();
        if(categoryFormats!=null&&categoryFormats.length>0){
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<categoryFormats.length;i++){
                sb.append(categoryFormats[i]);
                if(i!=categoryFormats.length-1){
                    sb.append(","); 
                }
            }        
            this.categoryFormat = sb.toString();
        }
        return this.categoryFormat;
    }
    
    /**
     *description的setter方法
     **/     
    public void setDescription(String description) {
        this.description = description;
    }
     /**
     *description的getter方法
     **/ 
    public String getDescription() {
        return this.description;
    }
	public String getCreatetimeString() {
	  return DateUtils.formatDateToString(getCreatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreatetimeString(String createtimeStr) {
	  setCreatetime(DateUtils.parse(createtimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createtime的setter方法
     **/     
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
     /**
     *createtime的getter方法
     **/ 
    public Date getCreatetime() {
        return this.createtime;
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
    public String[] getCategoryFormats() {
        return categoryFormats;
    }
    public void setCategoryFormats(String[] categoryFormats) {
        this.categoryFormats = categoryFormats;
    }
    public String getCategoryDesc() {
        return categoryDesc;
    }
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
	public Long getCreateId() {
		return createId;
	}
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	public Long getUpdateId() {
		return updateId;
	}
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
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