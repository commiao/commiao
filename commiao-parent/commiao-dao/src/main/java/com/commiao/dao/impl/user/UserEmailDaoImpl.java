package com.commiao.dao.impl.user;

import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserEmailDao;
import com.commiao.domain.pojo.user.UserEmail;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("userEmailDao")
public class UserEmailDaoImpl extends MybatisDAOSupport<UserEmail> implements UserEmailDao {

}
