package com.components.dao.impl.security;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.security.RoleDao;
import com.components.domain.pojo.security.Role;
/**
 * @author hbl
 * 2016-1-11上午10:56:29
 * 角色dao实现类
 */
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao{
	@Autowired
    protected SqlSession sqlSession;
	/**
	 * 保存角色
	 */
	public void insert(Role role) {
		this.sqlSession.insert("roleMapper.insert",role);
	}
	
	/**
	 * 根据id查询单个角色
	 */
	public Role getById(Long id) {
		return this.sqlSession.selectOne("roleMapper.getById",id);
	}
	
	/**
	 * 获取查询角色数量
	 */
    public Long getRoleCount(Role role){ 
		return (Long)this.sqlSession.selectOne("roleMapper.getRoleCount",role);
	}
    
    /**
     * 获取角色列表
     */
    public List<Role> findRole(Role role){
		return this.sqlSession.selectList("roleMapper.findRoles",role);
	}
    
    /**
     *更新角色
     */
	public void update(Role role) {
		this.sqlSession.update("roleMapper.update",role);
	}
	
	/**
	 * 根据id删除角色
	 */
	public void delete(Long id) {
		this.sqlSession.delete("roleMapper.delete", id);
	}
	
	/**
	 * 批量删除角色
	 */
	public void deleteByIds(List<Long> idList) {
		this.sqlSession.delete("roleMapper.deleteByIds", idList);
	}
	
	/**
	 * 保存角色菜单
	 */
	public void saveRoleMenu(Map<String, Object> conds) {
		this.sqlSession.insert("roleMapper.insertRoleMenu",conds);
	}
	
	/**
	 * 根据角色id获取对应的菜单ids
	 * @param roleid
	 * @return 
	 */
	public List<Long> getMenuIdsByRoleId(int roleId) {
		
		return this.sqlSession.selectList("roleMapper.getMenuIdsByRoleId", roleId);
	}

	/**
	 * 根据角色id删除对应的菜单id
	 */
	public void deleteRoleMenusById(Long roleid) {
		this.sqlSession.delete("roleMapper.deleteRoleMenusById", roleid);
	}

	/**
	 * 删除角色菜单表相关数据
	 */
	public void delRMS(List<Long> idList) {
		this.sqlSession.delete("roleMapper.delRMS", idList);
	}

	/**
	 * 删除角色在组织机构角色表相关数据
	 */
	public void delORS(List<Long> idList) {
		this.sqlSession.delete("roleMapper.delORS", idList);
	}

	/**
	 * 删除角色在用户权限表中相关数据
	 */
	public void delURMS(List<Long> idList) {
		this.sqlSession.delete("roleMapper.delURMS", idList);
	}

	/**
	 * 删除角色在用户组织机构角色表中相关数据
	 */
	public void delUORS(List<Long> idList) {
		this.sqlSession.delete("roleMapper.delUORS", idList);
	}

	/**
	 * 为保证数据准确性先查询出组织用户角色表中涉及该角色的相关用户ids
	 */
	public List<Long> getORUUserIds(long roleid) {
		return this.sqlSession.selectList("roleMapper.getORUUserIds", roleid);
	}

	/**
	 * 删除用户权限表相关数据
	 */
	public void deleteURM(Long roleid) {
		this.sqlSession.delete("roleMapper.deleteURM", roleid);
	}

	/**
	 * 保存用户权限表
	 */
	public void saveUserRoleMenu(Map<String, Object> conds) {
		this.sqlSession.insert("roleMapper.saveUserRoleMenu",conds);
	}
}
