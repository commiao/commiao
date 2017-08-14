package com.commiao.ssm.dao.impl;

import org.springframework.stereotype.Repository;

import com.commiao.ssm.dao.IDataGroupInfoDao;
import com.commiao.ssm.domain.DataGroupInfo;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("dataGroupInfoDao")
public class DataGroupInfoDaoImpl extends MybatisDAOSupport<DataGroupInfo> implements IDataGroupInfoDao {

}
