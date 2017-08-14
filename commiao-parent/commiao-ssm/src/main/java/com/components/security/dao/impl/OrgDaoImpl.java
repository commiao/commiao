package com.components.security.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.security.dao.OrgDao;
import com.components.security.domain.model.TreeGrid;
import com.components.security.domain.model.TreeNode;
import com.components.security.domain.pojo.Org;
import com.components.security.domain.pojo.SysUser;
/**
 * @author hbl
 * 2016-1-11下午3:35:56
 * 组织机构dao实现类
 */
@Repository("orgDao")
public class OrgDaoImpl implements OrgDao{
	@Autowired
    protected SqlSession sqlSession;
	/**
	 * 保存组织机构
	 */
	public void insert(Org org) {
		this.sqlSession.insert("orgMapper.insert",org);
	}
	
	/**
	 * 根据id查询组织机构
	 */
	public Org getById(Long id) {
		return this.sqlSession.selectOne("orgMapper.getById",id);
	}
	
	
    public Long getOrgCount(Org org){ 
		return (Long)this.sqlSession.selectOne("orgMapper.getOrgCount",org);
	}
    
    /**
	 * 获取组织机构treegrid
	 */
    public List<TreeGrid> findOrgsTreeGrid(){
		return this.sqlSession.selectList("orgMapper.findOrgsTreeGrid",0);
	}
    
    /**
     * 更新组织机构
     */
	public void update(Org org) {
		this.sqlSession.update("orgMapper.update",org);
	}
	
	/**
	 * 删除组织机构
	 */
	public void delete(Long id) {
		this.sqlSession.delete("orgMapper.delete", id);
	}
	
	/**
	 * 批量删除组织机构
	 */
	public void deleteByIds(List<Long> idList) {
		this.sqlSession.delete("orgMapper.deleteByIds", idList);
	}

    /**
     * 根据组织机构id删除对应角色
     */
	public void deleteOrgRoles(int orgId) {
		this.sqlSession.delete("orgMapper.deleteOrgRoles", orgId);
	}

	/**
	 * 保存组织机构角色
	 */
	public void saveOrgRoles(Map<String, Object> conds) {
		this.sqlSession.insert("orgMapper.saveOrgRoles", conds);
	}

	/**
	 * 根据orgid查询当前组织机构拥有的角色roleids
	 */
	public List<Long> getRoleIds(Long orgid) {
		return this.sqlSession.selectList("orgMapper.getRoleIds",orgid);
	}

	/**
	 * 获取组织机构用户
	 */
	public List<SysUser> getOrgSysUsers(int orgid) {
		return this.sqlSession.selectList("orgMapper.getOrgSysUsers",orgid);
	}

	/**
	 * 获取不属于当前组织机构用户
	 */
	public List<SysUser> getAbsentOrgSysUsers(int orgid) {
		return this.sqlSession.selectList("orgMapper.getAbsentOrgSysUsers",orgid);
	}

	/**
	 * 保存组织机构用户
	 */
	public void saveOrgSysUsers(Map<String, Object> conds) {
		this.sqlSession.insert("orgMapper.saveOrgSysUsers", conds);
	}

	/**
	 * 删除组织机构用户
	 */
	public void deleteOrgSysUser(Map<String, Object> conds) {
		this.sqlSession.delete("orgMapper.deleteOrgSysUser", conds);
	}

	/**
	 * 根据orgid查询当前组织机构拥有的用户userids
	 */
	public List<Long> getSysUserIds(Long orgid) {
		return this.sqlSession.selectList("orgMapper.getSysUserIds",orgid);
	}

	/**
	 * 根据roleid查询当前角色拥有的菜单menuids
	 */
	public List<Long> getMenuIds(Long roleid) {
		return this.sqlSession.selectList("orgMapper.getMenuIds",roleid);
	}

	/**
	 * 为保证更新数据数量准确先把该组织机构下的用户数据删除
	 */
	public void deleteOrgSysUserRole(Long userid, Long orgid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userid);
		conds.put("orgId", orgid);
		this.sqlSession.delete("orgMapper.deleteOrgSysUserRole",conds);
	}
	
	/**
	 * 新增组织机构用户角色
	 */
	public void saveOrgSysUserRole(Long roleid, Long userid, Long orgid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("roleId", roleid);
		conds.put("userId", userid);
		conds.put("orgId", orgid);
		this.sqlSession.insert("orgMapper.insertOrgSysUserRole",conds);
	}

	
	/**
	 * 删除用户角色菜单表
	 */
	public void deleteSysUserRoleMenu(Long userid, Long roleid, Long menuid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userid);
		conds.put("roleId", roleid);
		conds.put("menuId", menuid);
		this.sqlSession.delete("orgMapper.deleteSysUserRoleMenu",conds);
	}
	
	
	/**
	 * 保存用户角色菜单表
	 */
	public void insertSysUserRoleMenu(Long userid, Long roleid, Long menuid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userid);
		conds.put("roleId", roleid);
		conds.put("menuId", menuid);
		this.sqlSession.insert("orgMapper.insertSysUserRoleMenu",conds);
	}

	/**
	 * 获取组织机构下拉树
	 */
	public List<TreeNode> getTreeNode(int orgid) {
		return this.sqlSession.selectList("orgMapper.getOrgTreeNode",0);//为方便下默认orgid为0
	}

	/**
	 * 获取组织机构角色下拉树
	 */
	public List<TreeNode> getOrgRoleNode(int orgid) {
		return this.sqlSession.selectList("orgMapper.getOrgRoleNode",orgid);
	}

	/**
	 * 查询数据库是否存在这条数据
	 */
	public Long getSysUserRoleMenu(Long userid, Long roleid, Long menuid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userid);
		conds.put("roleId", roleid);
		conds.put("menuId", menuid);
		return this.sqlSession.selectOne("orgMapper.getSysUserRoleMenu",conds);
	}

	/**
	 * 删除用户菜单表
	 */
	public void deleteURM(Long userId) {
		this.sqlSession.delete("orgMapper.deleteURM", userId);
	}

	/**
	 * 查询用户是否在其他组织机构中
	 */
	public List<Long> getOtherOrg(Long userId,Long orgId) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userId);
		conds.put("orgId", orgId);
		return this.sqlSession.selectList("orgMapper.getOtherOrg",conds);
	}

	/**
	 * 删除用户菜单表数据(当用户属于其他组织机构并关联其他组织机构角色时用到)
	 */
	public void deleteURM(Long userId, Long otherorgroleid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userId);
		conds.put("otherorgroleid", otherorgroleid);
		this.sqlSession.delete("orgMapper.deleteURMLink", conds);
	}

	/**
	 * 把组织机构用户角色表中roleid字段置空
	 */
	public void updateOrgSysUser(Long userId, Long orgid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userId);
		conds.put("orgId", orgid);
		this.sqlSession.update("orgMapper.updateOrgSysUser",conds);
	}

	/**
	 * 删除组织机构时先把用户权限表相关数据删除
	 */
	public void delURM(Long orgid, Long userid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("userId", userid);
		conds.put("orgId", orgid);
		this.sqlSession.delete("orgMapper.delURM", conds);
	}

	/**
	 * 删除组织机构相关数据(组织机构角色表)
	 */
	public void delORS(List<Long> idList) {
		this.sqlSession.delete("orgMapper.delORS", idList);
	}

	/**
	 * 删除组织机构相关数据(组织机构用户表)
	 */
	public void delOURS(List<Long> idList) {
		this.sqlSession.delete("orgMapper.delOURS", idList);
	}

	/**
	 * 查询组织机构用户表中的用户id集合
	 */
	public List<Long> getOrgSysUserIds(Long roleid) {
		return this.sqlSession.selectList("orgMapper.getOrgSysUserIds",roleid);
	}

	/**
	 * 查询用户权限表中的用户id集合
	 */
	public List<Long> getRMSysUserIds(Long roleid) {
		return this.sqlSession.selectList("orgMapper.getRMSysUserIds",roleid);
	}

	/**
	 * 获取组织机构表中orgids
	 */
	public List<Long> getOrgIds(Long roleid) {
		return this.sqlSession.selectList("orgMapper.getOrgIds",roleid);
	}

	/**
	 * 组织机构保存角色时先更新用户权限表
	 */
	public void updateURM(List<Long> idList) {
		this.sqlSession.delete("orgMapper.updateURM", idList);
	}

	/**
	 * 更新组织机构用户角色表数据
	 */
	public void updateOUR(List<Long> idList) {
		this.sqlSession.delete("orgMapper.updateOUR", idList);
	}

}
