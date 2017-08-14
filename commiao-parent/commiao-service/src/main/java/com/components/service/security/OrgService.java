package com.components.service.security;

import java.util.List;

import com.components.domain.model.TreeGrid;
import com.components.domain.model.TreeNode;
import com.components.domain.pojo.security.Org;
import com.components.domain.pojo.security.SysUser;
/**
 * @author hbl
 * 2016-1-20下午6:13:13
 * 组织机构业务
 */
public interface OrgService {
    /**
     * 获取组织机构集合，返回以easyUI识别的DataGrid形式
     * @param org
     * @return 
     */
    public List<TreeGrid> getTreeGrid(Org org);
	/**
	 * 保存组织机构信息
	 * @param org
	 */
    public void save(Org org);
	/**
	 * 修改组织机构信息
	 * @param org
	 */
    public void update(Org org);
	/**
	 * 删除组织机构信息
	 * @param org
	 */
    public void delete(Org org);
	/**
	 * 批量删除组织机构信息
	 * @param org
	 */
    public void deleteByIds(String ids);
	/**
	 * 根据ID获取组织机构信息
	 * @param org
	 */
    public Org getById(Long id);
    
    /**
     * 根据组织机构id，删除组织机构角色
     * @param orgId
     */
	public void deleteOrgRoles(int orgId);
	
	/**
	 * 保存组织机构角色
	 * @param orgid
	 * @param roleids
	 */
	public void saveOrgRoles(String orgid, String roleids);
	
	/**
	 * 根据orgid查询当前组织机构拥有的角色roleids
	 * @param orgid
	 * @return
	 */
	public List<Long> getRoleIds(String orgid);
	
	/**
	 * 根据orgid查询组织机构用户
	 * @param orgid
	 * @return
	 */
	public List<SysUser> getOrgSysUsers(int orgid);
	/**
	 * 查询不属于当前组织机构用户
	 * @param orgid
	 * @return
	 */
	public List<SysUser> getAbsentOrgSysUsers(int parseInt);
	
	/**
	 * 保存组织机构用户
	 * @param parseInt
	 * @param userids 
	 * @return
	 */
	public void saveOrgSysUser(Long orgid, String userids);
	
	/**
	 * 删除组织机构用户
	 * @param orgid
	 * @param userids
	 */
	public void deleteOrgSysUsersByIds(int orgid, String userids);
	
	/**
	 * 更新用户角色权限
	 * @param parseInt
	 */
	public void updateSysUserRole(Long orgid);
	
	/**
	 * 获取组织机构下拉树
	 * @param orgid
	 * @return
	 */
	public List<TreeNode> getTreeNode(int orgid);
	
	/**
	 * 获取组织机构角色下拉树
	 * @param parseInt
	 * @return
	 */
	public List<TreeNode> getOrgRoleNode(int orgid);
	
	/**
	 * 保存新增用户的同时保存用户与组织机构和角色菜单的关系
	 * @param user_OrgId
	 * @param user_RoleId
	 * @param id
	 */
	public void saveSysUserOrgRole(String user_OrgId, String user_RoleId, Long userid);
	
	/**
	 * 删除组织机构相关表数据
	 * @param ids
	 */
	public void deleteRelatedByIds(String ids);
	
	/**
	 * 删除用户权限表相关数据
	 * @param orgid
	 * @param userids
	 */
	public void deleteRelated(Long orgid, String userids);
	
	/**
	 * 保存组织机构角色的时候更新组织机构用户表
	 */
	public void updateURM(List<Long> delroleIds);
	
	/**
	 * 保存组织机构角色时获取要删除的角色ids
	 * @param orgid
	 * @param roleids
	 * @return
	 */
	public List<Long> getDelRoleIds(String orgid, String roleids);
	
	/**
	 * 更新组织机构用户角色表数据
	 * @param roleids
	 */
	public void updateOUR(List<Long> delroleIds);

}
