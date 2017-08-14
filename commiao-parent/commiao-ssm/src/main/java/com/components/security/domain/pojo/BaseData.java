package com.components.security.domain.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
/**
 * 数据库映射基类
 * @author ningzhitao
 * Date   15/12/19
 */
public class BaseData  implements Serializable {
	private static final long serialVersionUID = -1L;
	
	/**
	 * 主键ID
	 */
	private Long id;
	/**
	 * 删除时的id集合，例："id1,id2,id3"
	 */
	private String ids;
	/**
	 * 主键创建时间
	 */
	private Date createTime;
	/**
	 * 主键修改时间
	 */
	private Date updateTime;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
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
	@Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
