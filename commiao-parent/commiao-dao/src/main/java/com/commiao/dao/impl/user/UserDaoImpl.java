package com.commiao.dao.impl.user;

import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserDao;
import com.commiao.domain.pojo.user.User;
import com.framework.common.core.dao.MybatisDAOSupport;
/**
 * @author jingmiao
 *
 */
@Repository("userDao")
public class UserDaoImpl extends MybatisDAOSupport<User> implements UserDao{

}
