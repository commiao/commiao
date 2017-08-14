package com.components.security.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.security.dao.SysUserDao;
import com.components.security.domain.pojo.SysUser;
/**
 * @author hbl
 * 2016-1-7上午11:40:11
 * 用户管理的dao
 */
@Repository("sysUserDao")
public class SysUserDaoImpl implements SysUserDao{
	@Autowired
    protected SqlSession sqlSession;	
	/* (non-Javadoc)
	 * @see com.commiao.dao.sys.SysUserDao#insert(com.commiao.domain.pojo.sys.SysUser)
	 */
	@Override
	public void insert(SysUser user) {
		this.sqlSession.insert("sysUserMapper.insert",user);
	}

	/* (non-Javadoc)
	 * @see com.commiao.dao.sys.SysUserDao#update(com.commiao.domain.pojo.sys.SysUser)
	 */
	@Override
	public void update(SysUser user) {
		this.sqlSession.update("sysUserMapper.update",user);
	}

	/* (non-Javadoc)
	 * @see com.commiao.dao.sys.SysUserDao#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		this.sqlSession.delete("sysUserMapper.delete", id);
	}
	
	/**
	 * 根据id查询单个用户
	 */
	public SysUser getById(Long id) {
		return this.sqlSession.selectOne("sysUserMapper.getById",id);
	}
	
	/**
	 * 获取查询用户数
	 */
    public Long getSysUserCount(SysUser user){ 
		return (Long)this.sqlSession.selectOne("sysUserMapper.getSysUserCount",user);
	}
    
    /**
     * 获取用户列表
     */
    public List<SysUser> findSysUser(SysUser user){
		return this.sqlSession.selectList("sysUserMapper.findSysUsers",user);
	}
    
    /**
     * 删除用户
     */
	public void deleteByIds(List<Long> idList) {
		this.sqlSession.delete("sysUserMapper.deleteByIds", idList);
	}

	/**
	 * 删除组织机构用户
	 */
	public void deleteOrgSysUser(long userid) {
		this.sqlSession.delete("sysUserMapper.deleteOrgSysUser", userid);
	}

	/**
	 * 删除用户角色菜单
	 */
	public void deleteSysUserRoleMenu(long userid) {
		this.sqlSession.delete("sysUserMapper.deleteSysUserRoleMenu", userid);
	}
}
