package com.components.security.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.security.dao.MenuDao;
import com.components.security.domain.model.TreeGrid;
import com.components.security.domain.model.TreeNode;
import com.components.security.domain.pojo.Menu;
/**
 * @author hbl
 * 2016-1-7下午5:55:47
 * 菜单dao实现类
 */
@Repository("menuDao")
public class MenuDaoImpl implements MenuDao{
	@Autowired
    protected SqlSession sqlSession;
	/**
	 * 获得系统菜单树
	 */
    public List<TreeNode> getAllTreeNode(){
		return this.sqlSession.selectList("menuMapper.getAllTreeNode",0);
	}
    
    /**
     * 保存菜单
     */
    public void insert(Menu menu) {
		this.sqlSession.insert("menuMapper.insert",menu);
	}
    
    /**
     * 根据id查询单个菜单
     */
	public Menu getById(Long id) {
		return this.sqlSession.selectOne("menuMapper.getById",id);
	}
	
	/**
	 * 获取查询菜单数量
	 */
    public Long getMenuCount(Menu menu){ 
		return (Long)this.sqlSession.selectOne("menuMapper.getMenuCount",menu);
	}
    
    public List<Menu> findMenu(Menu menu){
		return this.sqlSession.selectList("menuMapper.findMenus",menu);
	}
    
    /**
     * 更新菜单
     */
	public void update(Menu menu) {
		this.sqlSession.update("menuMapper.update",menu);
	}
	
	/**
     * 根据id删除单个菜单
     */
	public void delete(Long id) {
		this.sqlSession.delete("menuMapper.delete", id);
	}
	
	/**
     * 批量删除菜单菜单
     */
	public void deleteByIds(List<Long> idList) {
		this.sqlSession.delete("menuMapper.deleteByIds", idList);
	}

	/**
     * 查询菜单treegrid
     */
	public List<TreeGrid> findMenusTreeGrid(){
		return this.sqlSession.selectList("menuMapper.findMenusTreeGrid",0);
	}


	/**
	 * 根据角色id查询对应菜单树
	 */
	public List<TreeNode> getRoleMenu(Long roleid) {
		Map<String,Object> conds = new HashMap<String,Object>();
		conds.put("roleid", roleid);
		conds.put("parentid", 0);
		return this.sqlSession.selectList("menuMapper.getRoleMenu",conds);
	}

	/**
	 * 删除角色菜单数据
	 */
	public void deleteRoleMenu(List<Long> idList) {
		this.sqlSession.delete("menuMapper.deleteRoleMenu", idList);
	}

	/**
	 * 删除用户角色菜单数据
	 */
	public void deleteUserRoleMenu(List<Long> idList) {
		this.sqlSession.delete("menuMapper.deleteUserRoleMenu", idList);
	}
	
}
