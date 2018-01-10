package com.commiao.inteface.mgt.security.mapper;

import java.util.List;
import java.util.Map;

import core.entity.security.Role;

public interface RoleMapper {
    /**
	 * 新增角色信息
	 * @param role
	 */
    void insert(Role role);
	/**
	 * 修改角色信息
	 * @param role
	 */
    void update(Role role);
	/**
	 * 删除角色信息
	 * @param role
	 */
    void delete(Long id);
	/**
	 * 删除角色信息(批量)
	 * @param role
	 */
    void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取角色信息
	 * @param role
	 */
    Role getById(Long id);
    /**
     * 获取角色量
     * @param role
     * @return
     */
    Long getRoleCount(Role role);
    /**
     * 获取角色集合
     * @param role
     * @return
     */
    List<Role> findRole(Role role);
    
    /**
     * 保存角色菜单
     * @param conds
     */
	void saveRoleMenu(Map<String, Object> conds);
	
	/**
	 * 根据角色id获取对应的菜单ids
	 * @param roleid
	 * @return 
	 */
	List<Long> getMenuIdsByRoleId(int roleId);
	
	/**
	 * 根据角色id删除其对应的关联菜单
	 * @param roleid
	 */
	void deleteRoleMenusById(Long roleid);
	
	/**
	 * 删除角色菜单表相关数据
	 * @param idList
	 */
	void delRMS(List<Long> idList);
	
	/**
	 * 删除角色在组织机构角色表相关数据
	 * @param idList
	 */
	void delORS(List<Long> idList);
	
	/**
	 * 删除角色在用户权限表中相关数据
	 * @param idList
	 */
	void delURMS(List<Long> idList);
	
	/**
	 * 删除角色在用户组织机构角色表中相关数据
	 * @param idList
	 */
	void delUORS(List<Long> idList);
	
	/**
	 * 为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids
	 * @param roleid
	 * @return
	 */
	List<Long> getORUUserIds(long roleid);
	
	/**
	 * 删除用户权限表相关数据
	 */
	void deleteURM(Long roleid);
	
	/**
	 * 保存用户权限表
	 * @param conds
	 */
	void saveUserRoleMenu(Map<String, Object> conds);
}
