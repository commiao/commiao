package com.components.service.impl.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.security.RoleDao;
import com.commiao.domain.model.DataGrid;
import com.components.domain.pojo.security.Role;
import com.components.service.security.RoleService;
/**
 * Author hbl
 * Date   15/11/12.
 */
@Repository("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
    private RoleDao roleDao;
	
	public DataGrid getDataGrid(Role role){
		DataGrid dg = new DataGrid();
		dg.setTotal(roleDao.getRoleCount(role));
		dg.setRows(roleDao.findRole(role));
		return dg;
	}
	
	public void save(Role role) {
		roleDao.insert(role);
	}
	
    public void update(Role role){
		roleDao.update(role);
	}
    
    public void delete(Role role){
		roleDao.delete(role.getId());
	}
    
    /**
     * 删除一个或多个角色
     */
    public void deleteByIds(String ids){
    	if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
			}
			/**删除角色相关数据(角色菜单表、组织机构角色表、用户权限表、用户组织机构角色表)**/
			roleDao.delRMS(idList);//角色菜单表
			roleDao.delORS(idList);//组织机构角色表
			roleDao.delURMS(idList);//用户权限表
			roleDao.delUORS(idList);//用户组织机构角色表
			
			/**删除主表**/
			roleDao.deleteByIds(idList);
		}
	}
    
	public Role getById(Long id) {
		return roleDao.getById(id);
	}
    
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    /**
     * 保存角色对应的菜单id到数据库表里
     */
	@Override
	public void saveRoleMenu(String roleid, String menuids,List<Long> userids) {
		String[] menuIds = menuids.split(",");
		Long roleId = Long.parseLong(roleid);
		for(int i=0; i< menuIds.length; i++){
			Map<String,Object> conds = new HashMap<String,Object>();
			conds.put("roleId", roleId);
			conds.put("menuId", Long.parseLong(menuIds[i]));
			roleDao.saveRoleMenu(conds);
		}
		
		/**更新用户权限表**/
		if(userids.size()>0){
			for(Long userId:userids){
				if(menuIds.length>0){
					for(int i=0; i< menuIds.length; i++){
						Map<String,Object> conds = new HashMap<String,Object>();
						conds.put("roleId", roleId);
						conds.put("userId", userId);
						conds.put("menuId", Long.parseLong(menuIds[i]));
						roleDao.saveUserRoleMenu(conds);
					}
				}
			}
		}
		
	}

	/**
	 * 根据角色id获取对应的菜单ids
	 * @param roleid
	 * @return 
	 */
	@Override
	public List<Long> getMenuIdsByRoleId(int roleId) {
		List<Long> menuIds = roleDao.getMenuIdsByRoleId(roleId);
		return menuIds;
	}

	/**
	 * 删除角色对应的菜单
	 */
	public void deleteRoleMenus(Long roleid) {
		/**删除角色菜单数据**/
		roleDao.deleteRoleMenusById(roleid);
		
		/**删除用户权限表相关数据**/
		roleDao.deleteURM(roleid);
	}

	/**
	 * 为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids
	 */
	public List<Long> getORUUserIds(long roleid) {
		List<Long> userIds = roleDao.getORUUserIds(roleid);
		return userIds;
	}
}
