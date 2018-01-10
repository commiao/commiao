package com.commiao.inteface.mgt.security.mapper;

import java.util.List;

import core.easyui.TreeGrid;
import core.easyui.TreeNode;
import core.entity.security.Menu;

public interface MenuMapper {
    /**
     * 获取所有的菜单节点
     * @param menu
     * @return 
     */
	List<TreeNode> getAllTreeNode();
	/**
	 * 新增菜单信息
	 * @param menu
	 */
    void insert(Menu menu);
	/**
	 * 修改菜单信息
	 * @param menu
	 */
    void update(Menu menu);
	/**
	 * 删除菜单信息
	 * @param menu
	 */
    void delete(Long id);
	/**
	 * 删除菜单信息(批量)
	 * @param menu
	 */
    void deleteByIds(List<Long> idList);
    
	/**
	 * 根据ID获取菜单信息
	 * @param menu
	 */
    Menu getById(Long id);
    /**
     * 获取菜单量
     * @param menu
     * @return
     */
    Long getMenuCount(Menu menu);
    /**
     * 获取菜单集合
     * @param menu
     * @return
     */
    List<Menu> findMenus(Menu menu);
    
    /**
     * 菜单链接到菜单树列表
     * @return
     */
    List<TreeGrid> findMenusTreeGrid();
	
    /**
	 * 根据角色id查询对应菜单树
	 */
	List<TreeNode> getRoleMenu(Long roleid);
	
	/**
	 * 删除角色菜单数据
	 * @param idList
	 */
	void deleteRoleMenu(List<Long> idList);
	
	/**
	 * 删除用户角色菜单数据
	 * @param idList
	 */
	void deleteUserRoleMenu(List<Long> idList);
}
