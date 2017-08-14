/** **************************************************
 * Description: 
 * Copyright:   Copyright (c) 2008
 * Company:    cl
 * @author     caoxl
 * @version    1.0
 * @see
 HISTORY
 *  2008-7-1 caoxl Create File
 ************************************************* */
package com.framework.common.core.service;

import java.util.List;

import com.framework.common.core.domain.model.DataGrid;
import com.framework.common.core.entity.Entity;

public interface Service<E extends Entity> {

	public int save(E obj);
	
	public int update(E obj);
	
	public void delete(E obj);
	
	public void delete(Long id);
	
	public E getById(Long ID);
	
	public List<E> findAll();
	/**
	 * 获取easyui列表（根据对象查询全部数据）
	 * @param obj
	 * @return
	 */
	public DataGrid getDatagrid(E obj);
}