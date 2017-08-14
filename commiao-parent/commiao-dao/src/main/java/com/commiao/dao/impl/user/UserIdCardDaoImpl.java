package com.commiao.dao.impl.user;

import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserIdCardDao;
import com.commiao.domain.pojo.user.UserIdCard;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("userIdCardDao")
public class UserIdCardDaoImpl extends MybatisDAOSupport<UserIdCard> implements UserIdCardDao {

}
