package com.commiao.dao.impl.user;


import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserHeadPicDao;
import com.commiao.domain.pojo.user.UserHeadPic;
import com.framework.common.core.dao.MybatisDAOSupport;
@Repository("userHeadPicDao")
public class UserHeadPicDaoImpl extends MybatisDAOSupport<UserHeadPic> implements UserHeadPicDao {

}
