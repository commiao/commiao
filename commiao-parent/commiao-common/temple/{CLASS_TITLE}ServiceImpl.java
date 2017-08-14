package com.commiao.service.impl.{POJO_BAG};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.common.core.dao.DAO;
import com.commiao.common.core.service.ServiceSupport;
import com.commiao.domain.pojo.{POJO_BAG}.{CLASS_TITLE};
import com.commiao.dao.{POJO_BAG}.{CLASS_TITLE}Dao;
import com.commiao.service.{POJO_BAG}.{CLASS_TITLE}Service;

@Repository("{CLASS_NAME}Service")
public class {CLASS_TITLE}ServiceImpl extends ServiceSupport<{CLASS_TITLE}> implements {CLASS_TITLE}Service {
	
	@Autowired
    private {CLASS_TITLE}Dao {CLASS_NAME}Dao;
	@Override
	public DAO<{CLASS_TITLE}> getDao() {
		return {CLASS_NAME}Dao;
	}
	
}
