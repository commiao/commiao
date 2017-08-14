package com.components.dao.security;

import java.util.List;

import com.components.domain.pojo.security.SysUser;
/**
 * Author ningzhitao 
 * Date   15/12/19.
 */
public interface SysUserDao{
	/**
	 * 新增用户信息
	 * @param menu
	 */
    public void insert(SysUser user);
	/**
	 * 修改用户信息
	 * @param menu
	 */
    public void update(SysUser user);
	/**
	 * 删除用户信息
	 * @param menu
	 */
    public void delete(Long id);
    
	/**
	 * 删除用户信息(批量)
	 * @param user
	 */
    public void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取用户信息
	 * @param user
	 */
    public SysUser getById(Long id);
    /**
     * 获取用户量
     * @param user
     * @return
     */
    public Long getSysUserCount(SysUser user);
    /**
     * 获取用户集合
     * @param user
     * @return
     */
    public List<SysUser> findSysUser(SysUser user);

    /**
     * 删除组织机构用户
     * @param userid
     */
	public void deleteOrgSysUser(long userid);

	/**
     * 删除用户角色菜单
     * @param userid
     */
	public void deleteSysUserRoleMenu(long userid);
}
