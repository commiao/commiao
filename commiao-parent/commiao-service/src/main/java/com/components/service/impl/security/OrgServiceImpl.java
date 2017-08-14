package com.components.service.impl.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.security.OrgDao;
import com.components.domain.model.TreeGrid;
import com.components.domain.model.TreeNode;
import com.components.domain.pojo.security.Org;
import com.components.domain.pojo.security.SysUser;
import com.components.service.security.OrgService;
/**
 * @author hbl
 * 2016-1-12上午10:59:42
 * 处理组织机构相关业务实现类
 */
@Repository("orgService")
public class OrgServiceImpl implements OrgService {
	@Autowired
    private OrgDao orgDao;
	
	public List<TreeGrid> getTreeGrid(Org org){
		return orgDao.findOrgsTreeGrid();
	}
	
	public void save(Org org) {
		orgDao.insert(org);
	}
	
    public void update(Org org){
		orgDao.update(org);
	}
    
    public void delete(Org org){
		orgDao.delete(org.getId());
	}
    public void deleteByIds(String ids){
    	if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
			}
			orgDao.deleteByIds(idList);
		}
	}
    
	public Org getById(Long id) {
		return orgDao.getById(id);
	}
    
    public void setOrgDao(OrgDao orgDao) {
        this.orgDao = orgDao;
    }

	
	public void deleteOrgRoles(int orgId) {
		this.orgDao.deleteOrgRoles(orgId);
	}

	
	public void saveOrgRoles(String orgid, String roleids) {
		String[] roleIds = roleids.split(",");
		for(int i=0; i< roleIds.length; i++){
			Map<String,Object> conds = new HashMap<String,Object>();
			conds.put("orgId", Long.parseLong(orgid));
			conds.put("roleId", Long.parseLong(roleIds[i]));
			orgDao.saveOrgRoles(conds);
		}
	}

	/**
	 * 根据orgid查询当前组织机构拥有的角色roleids
	 * @param orgid
	 * @return
	 */
	public List<Long> getRoleIds(String orgid) {
		return orgDao.getRoleIds(Long.parseLong(orgid));
	}

	/**
	 * 根据orgid查询组织机构用户
	 */
	public List<SysUser> getOrgSysUsers(int orgid) {
		return orgDao.getOrgSysUsers(orgid);
	}

	/**
	 * 根据orgid查询不在当前组织机构用户
	 */
	public List<SysUser> getAbsentOrgSysUsers(int orgid) {
		return orgDao.getAbsentOrgSysUsers(orgid);
	}

	/**
	 * 保存组织机构用户
	 */
	public void saveOrgSysUser(Long orgid, String userids) {
		String[] userIds = userids.split(",");
		for(int i=0; i< userIds.length; i++){
			Map<String,Object> conds = new HashMap<String,Object>();
			conds.put("orgId", orgid);
			conds.put("userId", Long.parseLong(userIds[i]));
			orgDao.saveOrgSysUsers(conds);
		}
	}

	/**
	 * 删除组织机构用户
	 */
	public void deleteOrgSysUsersByIds(int orgid, String userids) {
		String[] userIds = userids.split(",");
		for(int i=0; i< userIds.length; i++){
			Map<String,Object> conds = new HashMap<String,Object>();
			conds.put("orgId", orgid);
			conds.put("userId", Long.parseLong(userIds[i]));
			orgDao.deleteOrgSysUser(conds);
		}
		
		/**删除用户权限表相关数据**/
		if(userIds.length >0){
			
		}
	}

	
	
	/**
	 * 获取组织机构下拉树
	 */
	public List<TreeNode> getTreeNode(int orgid) {
		return orgDao.getTreeNode(orgid);
	}

	/**
	 * 获取组织机构角色下拉树
	 */
	public List<TreeNode> getOrgRoleNode(int orgid) {
		return orgDao.getOrgRoleNode(orgid);
	}


	/**
	 * 删除用户权限表数据
	 */
	public void deleteRelated(Long orgid, String userids) {
		if(userids != null){
			for(String userid : userids.split(",")){
				/**删除用户权限表数据**/
				orgDao.delURM(orgid,Long.parseLong(userid));
			}
		}
	}
	
	
	/**
	 * 删除组织机构相关表数据
	 */
	public void deleteRelatedByIds(String ids) {
		if (ids != null) {
    		ArrayList<Long> idList = new ArrayList<Long>();
			for (String id : ids.split(",")) {
				idList.add(Long.parseLong(id));
				/**当前组织机构用户id集合**/
				List<Long> userids = orgDao.getSysUserIds(Long.parseLong(id));
				if(userids.size()>0){
					for(Long userid:userids){
						/**删除用户权限表数据**/
						orgDao.delURM(Long.parseLong(id),userid);
					}
				}
				
				/**删除组织机构相关数据(组织机构角色表)**/
				orgDao.delORS(idList);
				/**删除组织机构相关数据(组织机构用户表)**/
				orgDao.delOURS(idList);
			}
		}
	}
	

	
	/**
	 * 保存新增用户的同时保存用户与组织机构和角色菜单的关系
	 */
	public void saveSysUserOrgRole(String user_OrgId, String user_RoleId, Long userid) {
		String[] user_RoleIds ;
		if(user_RoleId.length()>0){
			user_RoleIds = user_RoleId.split(",");
			
			/**新增组织机构用户角色**/
			for(int i = 0; i<user_RoleIds.length; i++){
				orgDao.saveOrgSysUserRole(Long.parseLong(user_RoleIds[i]),userid,Long.parseLong(user_OrgId));
			}
			
			
			/**根据角色id查询角色对应的菜单id集合**/
			List<Long> menuids = new ArrayList<Long>();
			for(int i=0 ; i< user_RoleIds.length ; i++){
				menuids.addAll(orgDao.getMenuIds(Long.parseLong(user_RoleIds[i])));
			}

			/**保存用户角色菜单表**/
			if(menuids.size()>0){
				for(int j=0 ; j< user_RoleIds.length ; j++){
					for(int p=0 ; p< menuids.size() ; p++){
						Long count = orgDao.getSysUserRoleMenu(userid,Long.parseLong(user_RoleIds[j]),menuids.get(p));
						if(count == 0){
							/**新增用户权限表数据**/
							orgDao.insertSysUserRoleMenu(userid,Long.parseLong(user_RoleIds[j]),menuids.get(p));
						}
					}
				}
			}
		}
	}
	
	
	
	/**********************************************辅助方法（用户、角色、机构、菜单）更新调用*****************************************************/
	/**
	 * 更新机构用户角色
	 */
	public void updateSysUserRole(Long orgid) {
		/**当前组织机构用户id集合**/
		List<Long> userids = orgDao.getSysUserIds(orgid);
		/**当前组织机构角色id集合**/
		List<Long> roleids =orgDao.getRoleIds(orgid);

		/**更新组织机构用户角色表和用户角色菜单表**/
		if(roleids.size()>0){
			if(userids.size()>0){
				/**为保证更新数据数量准确先把该组织机构下的用户数据删除**/
				for(int i=0 ; i< userids.size() ; i++){
					orgDao.deleteOrgSysUserRole(userids.get(i), orgid);
				}


				/**再次把数据存入数据库**/
				for(int i=0 ; i< roleids.size() ; i++){
					for(int j=0 ; j< userids.size() ; j++){
						orgDao.saveOrgSysUserRole(roleids.get(i),userids.get(j),orgid);
					}
				}


				/**根据角色id查询角色对应的菜单id集合**/
				List<Long> menuids = new ArrayList<Long>();
				if(roleids.size()>0){
					for(int i=0 ; i< roleids.size() ; i++){
						menuids.addAll(orgDao.getMenuIds(roleids.get(i)));//会有重复数据
					}
				}

				/**保存用户角色菜单表**/
				if(menuids.size()>0){
					for(int i=0 ; i< userids.size() ; i++){
						for(int j=0 ; j< roleids.size() ; j++){
							for(int p=0 ; p< menuids.size() ; p++){
								/**更新之前把已有的先删除或者已有的不作操作也可**/
								orgDao.deleteSysUserRoleMenu(userids.get(i),roleids.get(j),menuids.get(p));

								orgDao.insertSysUserRoleMenu(userids.get(i),roleids.get(j),menuids.get(p));
							}
						}
					}
				}
			}else{
				/**此时表示该组织机构下没有关联用户但有角色，需要把用户权限表多余的数据删除(在组织机构删除用户时已做处理)**/
				/**组织机构用户表中的userids**//*
				Set<Long> or_userids = new HashSet<Long>();
				*//**用户权限表中的userids**//*
				Set<Long> mr_userids = new HashSet<Long>();
				
				for(Long roleid:roleids){
					*//**组织机构用户表中的userids**//*
					or_userids.addAll(orgDao.getOrgSysUserIds(roleid));
					*//**用户权限表中的userids**//*
					mr_userids.addAll(orgDao.getRMSysUserIds(roleid));
				}*/
			}
		} else {
			if(userids.size()>0){
				/**此时表示该组织机构没有关联的角色但有关联用户，需要把用户角色菜单中数据删除，而组织机构角色用户表只保留userid和orgid**/
				for(Long userId: userids){
					/**查询用户是否在其他组织机构中**/
					List<Long> otherOrgIds = orgDao.getOtherOrg(userId,orgid);

					if(otherOrgIds.size() > 0){  //表示此用户也属于其他组织机构，这样需要删除本组织机构的角色菜单保留其他组织机构的角色菜单
						for(Long otherorgid : otherOrgIds){
							List<Long> otherOrgRoleids =orgDao.getRoleIds(otherorgid);
							if(otherOrgRoleids.size()>0){
								/**删除用户角色菜单表(含有其他组织机构角色的数据不删除)**/
								for(Long otherorgroleid :otherOrgRoleids ){
									orgDao.deleteURM(userId,otherorgroleid);
								}
							}else{
								/**此时表示该用户虽然也属于其他组织机构但其他组织机构没有关联角色，可以放心删除数据**/
								orgDao.deleteURM(userId);
							}
						}
					}else{
						/**用户只属于当前组织机构**/
						orgDao.deleteURM(userId);
					}
					/**以上是操作用户角色菜单表**/

					/**此时更新组织机构用户表，把roleid字段置空**/
					orgDao.updateOrgSysUser(userId,orgid);
				}
			}else{
				/**此时表示该组织机构没有关联角色和关联用户不需操作**/
			}
		}
	}
	/******************************************************end************************************************************/

	/**
	 * 保存组织机构角色时获取要删除的角色ids
	 */
	public List<Long> getDelRoleIds(String orgid, String roleids) {
		/**当前组织机构角色id集合**/
		List<Long> currentRoleDds =orgDao.getRoleIds(Long.parseLong(orgid));
		
		/**新增的组织机构角色id集合**/
		List<Long> addRoleIds = new ArrayList<Long>();
		if(roleids.length()>0){
			for (String addRoleId : roleids.split(",")) {
				addRoleIds.add(Long.parseLong(addRoleId));
			}
		}
		
		/**需要删除的roleids**/
		currentRoleDds.removeAll(addRoleIds);
		
		return currentRoleDds;
	}
	
	
	/**
	 * 组织机构保存角色时先更新用户权限表
	 */
	public void updateURM(List<Long> delroleIds) {
		orgDao.updateURM(delroleIds);
	}

	/**
	 * 更新组织机构用户角色表数据
	 */
	public void updateOUR(List<Long> delroleIds) {
		orgDao.updateOUR(delroleIds);
	}

}
