package com.framework.common.core.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.framework.common.core.entity.Entity;

public interface DAO<E extends Entity> {
	
	public int INSERT(E obj);
	public int UPDATE(E obj);
	/**
	 * 更新指定字段
	 * @param keys "{A}{B}{C}..." 要更新的属性名
	 * @param objs A,B,C... 对应参数
	 * @return
	 */
	public int UPDATE(String keys, Object... objs);
	/**
	 * 根据主键删除一条记录
	 * @param id
	 * @return
	 */
	public int DELETE(Serializable id);
	/**
	 * 根据对象id删除一条记录
	 * @param obj
	 * @return
	 */
	public int DELETE(E obj);
	/**
	 * getById 根据 主键 获取一条记录
	 * @param id
	 * @return
	 */
	public E GET(Serializable id);
	/**
	 * getOne 根据 map 获取一条记录
	 * @param paramterMap map集合
	 * @return
	 */
	public E GET(Map<String,Object> paramterMap);
	/**
	 * getOne 根据 对象 获取一条记录
	 * @param object object Class类实例化对象
	 * @return
	 */
	public E GET(E obj);
	/**
	 * getOne 根据 参数 获取一条记录
	 * @param keys "{A}{B}{C}..."
	 * @param objs A,B,C...
	 * @return
	 */
	public E GET(String keys, Object... objs);
	/**
	 * findAll 查找全部记录
	 * @return
	 */
	public List<E> GET_LIST();
	/**
	 * findAll 根据 对象 查找全部记录
	 * @param obj
	 * @return
	 */
	public List<E> GET_LIST(E obj);
	/**
	 * findAll 根据 map 查找全部记录
	 * @param paramterMap map集合
	 * @return
	 */
	public List<E> GET_LIST(Map<String,Object> paramterMap);
	/**
	 * findAll 根据 参数 查找全部记录
	 * @param keys "{A}{B}{C}..."
	 * @param objs A,B,C...
	 * @return
	 */
	public List<E> GET_LIST(String keys, Object... objs);
	/**
	 * 查询全部记录条数
	 * @return
	 */
	public Long COUNT();
	/**
	 * 根据 对象 查询条数
	 * @param object Class类实例化对象
	 * @return
	 */
	public Long COUNT(E obj);
	/**
	 * 根据 map 查询条数
	 * @param paramterMap map集合
	 * @return
	 */
	public Long COUNT(Map<String,Object> paramterMap);
	/**
	 * 根据 参数 查询条数
	 * @param mapper mapper
	 * @param keys "{A}{B}{C}..."
	 * @param objs A,B,C...
	 * @return
	 */
	public Long COUNT(String keys, Object... objs);
	
	/**
	 * mybatise 添加一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int insert(String methodName, Object parameter);
	/**
	 * mybatise 删除一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int delete(String methodName, Object parameter);
	/**
	 * mybatise 更新一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int update(String methodName, Object parameter);
	/**
	 * mybatise 获取一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public E selectOne(String methodName, Object parameter);
	/**
	 * mybatise 获取多条数据集合
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public List<E> selectList(String methodName, Object parameter);
	/**
	 * mybatise 获取多条数据条数
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public Long count(String methodName, Object parameter);
}
