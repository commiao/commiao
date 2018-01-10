package com.commiao.inteface.mgt.security.mapper;

import java.util.List;
import java.util.Map;

import core.easyui.TreeGrid;
import core.easyui.TreeNode;
import core.entity.security.Org;
import core.entity.security.SysUser;

public interface OrgMapper {
    /**
	 * 新增组织机构信息
	 * @param org
	 */
    void insert(Org org);
	/**
	 * 修改组织机构信息
	 * @param org
	 */
    void update(Org org);
	/**
	 * 删除组织机构信息
	 * @param org
	 */
    void delete(Long id);
	/**
	 * 删除组织机构信息(批量)
	 * @param org
	 */
    void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取组织机构信息
	 * @param org
	 */
    Org getById(Long id);
    /**
     * 获取组织机构量
     * @param org
     * @return
     */
    Long getOrgCount(Org org);
    
    /**
     * 获得组织机构树
     * @return
     */
    List<TreeGrid> findOrgsTreeGrid();
    
    /**
     * 删除组织机构角色
     * @param orgId
     */
	void deleteOrgRoles(int orgId);
	
	/**
	 * 保存组织机构角色
	 * @param conds
	 */
	void saveOrgRoles(Map<String, Object> conds);
	
	/**
	 * 根据orgid查询当前组织机构拥有的角色roleids
	 * @param orgid
	 * @return
	 */
	List<Long> getRoleIds(Long orgid);
	
	/**
	 * 获取组织机构用户
	 * @param orgid
	 * @return
	 */
	List<SysUser> getOrgSysUsers(int orgid);
	
	/**
	 * 获取不在当前组织机构用户
	 * @param orgid
	 * @return
	 */
	List<SysUser> getAbsentOrgSysUsers(int orgid);
	
	/**
	 * 保存组织机构用户
	 * @param conds
	 */
	void saveOrgSysUsers(Map<String, Object> conds);
	
	/**
	 * 删除组织机构用户
	 * @param conds
	 */
	void deleteOrgSysUser(Map<String, Object> conds);
	
	/**
	 * 根据orgid查询当前组织机构拥有的用户userids
	 * @param orgid
	 * @return
	 */
	List<Long> getSysUserIds(Long orgid);
	
	/**
	 * 根据roleid查询当前角色拥有的菜单menuids
	 * @param roleid
	 * @return
	 */
	List<Long> getMenuIds(Long roleid);
	
	/**
	 * 新增组织机构用户角色
	 * @param roleid
	 * @param userid
	 * @param orgid
	 */
	void saveOrgSysUserRole(Long roleid, Long userid, Long orgid);
	
	/**
	 * 保存用户角色菜单表
	 * @param userid
	 * @param roleid
	 * @param menuid
	 */
	void insertSysUserRoleMenu(Long userid, Long roleid, Long menuid);
	
	/**
	 * 删除用户角色菜单表
	 * @param userid
	 * @param roleid
	 * @param menuid
	 */
	void deleteSysUserRoleMenu(Long userid, Long roleid, Long menuid);
	
	/**
	 * 为保证更新数据数量准确先把该组织机构下的用户数据删除
	 * @param userid
	 * @param orgid
	 */
	void deleteOrgSysUserRole(Long userid, Long orgid);
	
	/**
	 * 获取组织机构下拉树
	 * @param orgid 
	 * @return
	 */
	List<TreeNode> getTreeNode(int orgid);
	
	/**
	 * 获取组织机构角色下拉树
	 * @param orgid 
	 * @return
	 */
	List<TreeNode> getOrgRoleNode(int orgid);
	
	/**
	 * 查询数据库是否存在这条数据
	 * @param userid
	 * @param parseInt
	 * @param long1
	 * @return
	 */
	Long getSysUserRoleMenu(Long userid, Long roleid, Long menuid);
	
	/**
	 * 删除用户菜单表数据
	 * @param userId
	 */
	void deleteURM(Long userId);
	
	/**
	 * 查询用户是否在其他组织机构中
	 * @param userId
	 * @return
	 */
	List<Long> getOtherOrg(Long userId,Long orgId);
	
	
	/**
	 * 删除用户菜单表数据(当用户属于其他组织机构并关联其他组织机构角色时用到)
	 * @param userId
	 */
	void deleteURM(Long userId, Long otherorgroleid);
	
	/**
	 * 把组织机构用户角色表中roleid字段置空
	 * @param userId
	 * @param orgid
	 */
	void updateOrgSysUser(Long userId, Long orgid);
	
	/**
	 * 删除组织机构时先把用户权限表相关数据删除
	 * @param orgid
	 * @param userid
	 */
	void delURM(Long orgid, Long userid);
	
	/**
	 * 删除组织机构相关数据(组织机构角色表)
	 * @param idList
	 */
	void delORS(List<Long> idList);
	
	/**
	 * 删除组织机构相关数据(组织机构用户表)
	 * @param idList
	 */
	void delOURS(List<Long> idList);
	
	/**
	 * 查询组织机构用户表中的用户id集合
	 * @param roleid
	 */
	List<Long> getOrgSysUserIds(Long roleid);
	
	/**
	 * 查询用户权限表中的用户id集合
	 * @param roleid
	 */
	List<Long> getRMSysUserIds(Long roleid);
	
	/**
	 * 获取组织机构表中orgids
	 * @param roleid
	 */
	List<Long> getOrgIds(Long roleid);
	
	/**
	 * 组织机构保存角色时先更新用户权限表
	 * @param delroleIds
	 */
	void updateURM(List<Long> delroleIds);
	
	
	void updateOUR(List<Long> delroleIds);
}
