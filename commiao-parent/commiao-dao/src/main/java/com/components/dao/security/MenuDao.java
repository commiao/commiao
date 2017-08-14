package com.components.dao.security;

import java.util.List;

import com.components.domain.model.TreeGrid;
import com.components.domain.model.TreeNode;
import com.components.domain.pojo.security.Menu;
/**
 * @author hbl
 * 2016-1-21上午10:03:27
 * 菜单dao接口
 */
public interface MenuDao {
	    /**
	     * 获取所有的菜单节点
	     * @param menu
	     * @return 
	     */
		public List<TreeNode> getAllTreeNode();
		/**
		 * 新增菜单信息
		 * @param menu
		 */
	    public void insert(Menu menu);
		/**
		 * 修改菜单信息
		 * @param menu
		 */
	    public void update(Menu menu);
		/**
		 * 删除菜单信息
		 * @param menu
		 */
	    public void delete(Long id);
		/**
		 * 删除菜单信息(批量)
		 * @param menu
		 */
	    public void deleteByIds(List<Long> idList);
	    
		/**
		 * 根据ID获取菜单信息
		 * @param menu
		 */
	    public Menu getById(Long id);
	    /**
	     * 获取菜单量
	     * @param menu
	     * @return
	     */
	    public Long getMenuCount(Menu menu);
	    /**
	     * 获取菜单集合
	     * @param menu
	     * @return
	     */
	    public List<Menu> findMenu(Menu menu);
	    
	    /**
	     * 菜单链接到菜单树列表
	     * @return
	     */
	    public List<TreeGrid> findMenusTreeGrid();
		
	    /**
		 * 根据角色id查询对应菜单树
		 */
		public List<TreeNode> getRoleMenu(Long roleid);
		
		/**
		 * 删除角色菜单数据
		 * @param idList
		 */
		public void deleteRoleMenu(List<Long> idList);
		
		/**
		 * 删除用户角色菜单数据
		 * @param idList
		 */
		public void deleteUserRoleMenu(List<Long> idList);
}
