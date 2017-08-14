package com.components.security.service;

import java.util.List;

import com.components.security.domain.model.TreeGrid;
import com.components.security.domain.model.TreeNode;
import com.components.security.domain.pojo.Menu;
/**
 * Author ningzhitao 
 * Date   15/12/19.
 */
public interface MenuService {
    /**
     * 获取所有的菜单节点
     * @return 
     */
    public List<TreeNode> getAllTreeNode();

    /**
     * 获取菜单集合，返回以easyUI识别的TreeGrid形式
     * @return 
     */
    public List<TreeGrid> getTreeGrid();
	/**
	 * 保存菜单信息
	 * @param menu
	 */
    public void save(Menu menu);
	/**
	 * 修改菜单信息
	 * @param menu
	 */
    public void update(Menu menu);
	/**
	 * 删除菜单信息
	 * @param menu
	 */
    public void delete(Menu menu);
	/**
	 * 批量删除菜单信息
	 * @param menu
	 */
    public void deleteByIds(String ids);
	/**
	 * 根据ID获取菜单信息
	 * @param menu
	 */
    public Menu getById(Long id);



    /**
     * 获取角色菜单 列表
     * @param roleid
     * @return
     */
	public List<TreeNode> getRoleMenu(Long roleid);

	/**
	 * 删除关联表中数据
	 * @param ids
	 */
	public void deleteRelatedByIds(String ids);

}
