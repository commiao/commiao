package com.commiao.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.commiao.ssm.dao.IDataColumnDao;
import com.commiao.ssm.domain.DataColumn;
import com.commiao.ssm.service.IDataColumnService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

@Repository("dataColumnService")
public class DataColumnServiceImpl extends ServiceSupport<DataColumn> implements IDataColumnService{
	@Resource
	private IDataColumnDao dataColumnDao;
	@Override
	public DAO<DataColumn> getDao() {
		return dataColumnDao;
	}
}