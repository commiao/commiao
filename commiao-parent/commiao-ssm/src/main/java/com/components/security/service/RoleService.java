package com.components.security.service;

import java.util.List;

import com.framework.common.core.domain.model.DataGrid;
import com.components.security.domain.pojo.Role;
/**
 * Author ningzhitao 
 * Date   15/11/12.
 */
public interface RoleService {
    /**
     * 获取角色集合，返回以easyUI识别的DataGrid形式
     * @param role
     * @return 
     */
    public DataGrid getDataGrid(Role role);
	/**
	 * 保存角色信息
	 * @param role
	 */
    public void save(Role role);
	/**
	 * 修改角色信息
	 * @param role
	 */
    public void update(Role role);
	/**
	 * 删除角色信息
	 * @param role
	 */
    public void delete(Role role);
	/**
	 * 批量删除角色信息
	 * @param role
	 */
    public void deleteByIds(String ids);
	/**
	 * 根据ID获取角色信息
	 * @param role
	 */
    public Role getById(Long id);
    
    /**
	 * 保存角色对应的菜单
     * @param userids 
	 * @param role
	 */
	public void saveRoleMenu(String roleid, String menuids, List<Long> userids);
	
	/**
	 * 根据角色id获取对应的菜单ids
	 * @param roleId
	 * @return 
	 */
	public List<Long> getMenuIdsByRoleId(int roleId);
	
	/**
	 * 删除角色对应的菜单
	 * @param roleid
	 */
	public void deleteRoleMenus(Long roleid);
	
	/**
	 * 为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids
	 * @param parseLong
	 * @return
	 */
	public List<Long> getORUUserIds(long roleid);

}
