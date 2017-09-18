package com.chtwm.mall.pojo.dataManager;

public class DataManager {
	
	private int id;//主键
	private String dataType;//数据类型
	private String dataValue;//值
    /**
     * 是否启用
     */
    private int enables;
	private String remark;//备注
	private String createTime;//创建时间
	private String updateTime;//修改时间
	private String dataTypeName;//类型名称
	
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 创建人名称
     */
    private String createName;
    /**
     * 修改人ID
     */
    private Long updateId;
    /**
     * 修改人名称
     */
    private String updateName;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDataTypeName() {
		return dataTypeName;
	}
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}
    public Long getCreateId() {
        return createId;
    }
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Long getUpdateId() {
        return updateId;
    }
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
    public int getEnables() {
        return enables;
    }
    public void setEnables(int enables) {
        this.enables = enables;
    }
	

}
