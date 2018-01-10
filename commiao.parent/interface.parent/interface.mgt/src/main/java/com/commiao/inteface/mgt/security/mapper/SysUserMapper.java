package com.commiao.inteface.mgt.security.mapper;

import java.util.List;

import core.entity.security.SysUser;

public interface SysUserMapper {
	/**
	 * 新增用户信息
	 * @param menu
	 */
    void insert(SysUser user);
	/**
	 * 修改用户信息
	 * @param menu
	 */
    void update(SysUser user);
	/**
	 * 删除用户信息
	 * @param menu
	 */
    void delete(Long id);
    
	/**
	 * 删除用户信息(批量)
	 * @param user
	 */
    void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取用户信息
	 * @param user
	 */
    SysUser getById(Long id);
    /**
     * 获取用户量
     * @param user
     * @return
     */
    Long getSysUserCount(SysUser user);
    /**
     * 获取用户集合
     * @param user
     * @return
     */
    List<SysUser> findSysUsers(SysUser user);

    /**
     * 删除组织机构用户
     * @param userid
     */
	void deleteOrgSysUser(long userid);

	/**
     * 删除用户角色菜单
     * @param userid
     */
	void deleteSysUserRoleMenu(long userid);
}
