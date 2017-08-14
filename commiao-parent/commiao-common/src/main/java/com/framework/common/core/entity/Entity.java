package com.framework.common.core.entity;

import java.io.Serializable;

/**
 * Description: 实体类的接口
 */
public interface Entity extends Serializable {
	
	/**
	 * 主键
	 * @return
	 */
	public Long getId();

	/**
	 * @return 是否是新建的
	 */
	public boolean isNew();


}
