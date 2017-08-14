package com.commiao.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.commiao.ssm.dao.IDataGroupInfoDao;
import com.commiao.ssm.domain.DataGroupInfo;
import com.commiao.ssm.service.IDataGroupInfoService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

@Repository("dataGroupInfoService")
public class DataGroupInfoServiceImpl extends ServiceSupport<DataGroupInfo> implements IDataGroupInfoService{
	@Resource
	private IDataGroupInfoDao dataGroupInfodao;
	@Override
	public DAO<DataGroupInfo> getDao() {
		return dataGroupInfodao;
	}
}