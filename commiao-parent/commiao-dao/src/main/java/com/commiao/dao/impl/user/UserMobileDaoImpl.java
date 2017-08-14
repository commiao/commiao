package com.commiao.dao.impl.user;

import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserMobileDao;
import com.commiao.domain.pojo.user.UserMobile;
import com.framework.common.core.dao.MybatisDAOSupport;
@Repository("userMobileDao")
public class UserMobileDaoImpl extends MybatisDAOSupport<UserMobile> implements UserMobileDao {

}
