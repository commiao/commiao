package com.framework.common.core.entity;
/**
 * Description: 实体类的默认实现类
 */
public abstract class EntitySupport implements Entity {

	private static final long serialVersionUID = -1L;
	
	/**
	 * 翻页信息--当前页
	 */
	private int page;
	/**
	 * 翻页信息--每页显示的条数
	 */
	private int rows;
	/**
	 * 查询数据库的开始位置
	 */
	private int startRows;
	/**
	 * 查询数据库的结束位置
	 */
	private int endRows;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getStartRows() {
		startRows = (page-1)*rows;
		return startRows;
	}
	public void setStartRows(int startRows) {
		this.startRows = startRows;
	}
	public int getEndRows() {
		endRows = page*rows;
		return endRows;
	}
	public void setEndRows(int endRows) {
		this.endRows = endRows;
	}
	
	public boolean isNew() {
		return getId() == null || getId().longValue()<=0;
	}
	
	/**
	 * 指示其他某个对象是否与此对象“相等”
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if (this == obj){
			return true;
		}
		if (!getClass().equals(obj.getClass())){
			return false;
		}
		
		Entity that = (Entity)obj;
		if(that.getId()==null || !getId().equals(that.getId())){
			return false;
		}
		
		return true;
	}

	/**
	 * 返回该对象的哈希码值
	 */
	@Override
	public int hashCode() {
		
		int result = 17;
		
		result = result * 31 + (getClass().getName().hashCode());
		result = result * 31 + (getId()==null?0:getId().hashCode());
		
		return result;
	}

	/**
	 * 返回该对象的字符串表示(类似数组的toString方法输出结果)
	 */
	@Override
	public String toString() {
		return new StringBuffer(getClass().getName()).append(":ID=").append(getId()==null?"NULL":getId()).toString();
	}
	
}
