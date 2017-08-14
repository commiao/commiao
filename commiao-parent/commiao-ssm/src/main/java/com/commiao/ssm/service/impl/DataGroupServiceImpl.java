package com.commiao.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.commiao.ssm.dao.IDataGroupDao;
import com.commiao.ssm.domain.DataGroup;
import com.commiao.ssm.service.IDataGroupService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

@Repository("dataGroupService")
public class DataGroupServiceImpl extends ServiceSupport<DataGroup> implements IDataGroupService {
	@Resource
	private IDataGroupDao dataGroupdao;
	@Override
	public DAO<DataGroup> getDao() {
		return dataGroupdao;
	}
}