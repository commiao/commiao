package com.components.security.dao;

import java.util.List;
import java.util.Map;

import com.components.security.domain.pojo.Role;
/**
 * @author hbl
 * 2016-1-11上午10:55:54
 * 角色dao
 */
public interface RoleDao {
    /**
	 * 新增角色信息
	 * @param role
	 */
    public void insert(Role role);
	/**
	 * 修改角色信息
	 * @param role
	 */
    public void update(Role role);
	/**
	 * 删除角色信息
	 * @param role
	 */
    public void delete(Long id);
	/**
	 * 删除角色信息(批量)
	 * @param role
	 */
    public void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取角色信息
	 * @param role
	 */
    public Role getById(Long id);
    /**
     * 获取角色量
     * @param role
     * @return
     */
    public Long getRoleCount(Role role);
    /**
     * 获取角色集合
     * @param role
     * @return
     */
    public List<Role> findRole(Role role);
    
    /**
     * 保存角色菜单
     * @param conds
     */
	public void saveRoleMenu(Map<String, Object> conds);
	
	/**
	 * 根据角色id获取对应的菜单ids
	 * @param roleid
	 * @return 
	 */
	public List<Long> getMenuIdsByRoleId(int roleId);
	
	/**
	 * 根据角色id删除其对应的关联菜单
	 * @param roleid
	 */
	public void deleteRoleMenusById(Long roleid);
	
	/**
	 * 删除角色菜单表相关数据
	 * @param idList
	 */
	public void delRMS(List<Long> idList);
	
	/**
	 * 删除角色在组织机构角色表相关数据
	 * @param idList
	 */
	public void delORS(List<Long> idList);
	
	/**
	 * 删除角色在用户权限表中相关数据
	 * @param idList
	 */
	public void delURMS(List<Long> idList);
	
	/**
	 * 删除角色在用户组织机构角色表中相关数据
	 * @param idList
	 */
	public void delUORS(List<Long> idList);
	
	/**
	 * 为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids
	 * @param roleid
	 * @return
	 */
	public List<Long> getORUUserIds(long roleid);
	
	/**
	 * 删除用户权限表相关数据
	 */
	public void deleteURM(Long roleid);
	
	/**
	 * 保存用户权限表
	 * @param conds
	 */
	public void saveUserRoleMenu(Map<String, Object> conds);
    
}
