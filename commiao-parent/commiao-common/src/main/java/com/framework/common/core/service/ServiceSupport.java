package com.framework.common.core.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.framework.common.core.dao.DAO;
import com.framework.common.core.domain.model.DataGrid;
import com.framework.common.core.entity.Entity;

@Transactional
public abstract class ServiceSupport<E extends Entity> implements Service<E> {
	/**
	 * Logger for this class
	 */
	protected final Logger logger = Logger.getLogger(getClass());
	
	public ServiceSupport(){	}

	public abstract DAO<E> getDao();

	public int save(E obj) {
		return getDao().INSERT(obj);
	}
	
	public int update(E obj) {
		return getDao().UPDATE(obj);
	}

	public E getById(Long id) {
		return (E)getDao().GET(id);
	}

	public void delete(E obj) {
		getDao().DELETE(obj);
	}
	
	public void delete(Long id) {
		getDao().DELETE(id);
	}

	public List<E> findAll() {
		return getDao().GET_LIST();
	}
	
	public DataGrid getDatagrid(E obj){
		DataGrid dg = new DataGrid();
		dg.setTotal(getDao().COUNT(obj));
		dg.setRows(getDao().GET_LIST(obj));
		return dg;
	}
}
