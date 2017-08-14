package com.commiao.ssm.dao.impl;

import org.springframework.stereotype.Repository;

import com.commiao.ssm.dao.IDataGroupDao;
import com.commiao.ssm.domain.DataGroup;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("dataGroupDao")
public class DataGroupDaoImpl extends MybatisDAOSupport<DataGroup> implements IDataGroupDao {

}
