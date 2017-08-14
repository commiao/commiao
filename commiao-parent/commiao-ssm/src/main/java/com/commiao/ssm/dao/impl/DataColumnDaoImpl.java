package com.commiao.ssm.dao.impl;

import org.springframework.stereotype.Repository;

import com.commiao.ssm.dao.IDataColumnDao;
import com.commiao.ssm.domain.DataColumn;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("dataColumnDao")
public class DataColumnDaoImpl extends MybatisDAOSupport<DataColumn> implements IDataColumnDao {

}
