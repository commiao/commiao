/** **************************************************
 * Description: DAO的默认实现类
 * Copyright:   Copyright (c) 2008
 * Company:    cl
 * @author     caoxl
 * @version    1.0
 * @see
 HISTORY
 *  2008-7-1 caoxl Create File
 ************************************************* */
package com.framework.common.core.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.framework.common.core.domain.model.map.ParamterMap;
import com.framework.common.core.entity.Entity;

public class MybatisDAOSupport<E extends Entity> implements DAO<E> {
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	protected SqlSession sqlSession;
	private String mapperName = null;
	private final static String INSERT = "insert"; 
	private final static String UPDATE = "update"; 
	private final static String GETBYID = "getById";
	private final static String GETONE = "getOne";
	private final static String FINDALL= "findAll";
	private final static String DELETE = "delete";
	private final static String DELBYID = "deleteById";
	private final static String GETCOUNT= "getCount";
	
	@SuppressWarnings("rawtypes")
	private Class entityClass;
	public MybatisDAOSupport(){
		entityClass =(Class<?>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		mapperName = getMapperName(entityClass.getSimpleName());
	}
	
	private String getMapperName(String simpleName){
		char[] cs = simpleName.toCharArray();
		if (cs[0] >= 'A' && cs[0] <= 'Z') {
			cs[0] += 32;
		}
		return String.valueOf(cs)+"Mapper.";
	}

	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#INSERT(com.huixin.common.core.entity.Entity)
	 */
	public int INSERT(final E obj){
		return insert(INSERT, obj);
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#UPDATE(com.huixin.common.core.entity.Entity)
	 */
	public int UPDATE(final E obj){
		return update(UPDATE, ParamterMap.build(obj));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#UPDATE(java.lang.String, java.lang.Object[])
	 */
	public int UPDATE(String keys, Object... objs){
		return update(UPDATE, ParamterMap.build(keys,objs));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#DELETE(com.huixin.common.core.entity.Entity)
	 */
	public int DELETE(final E obj){
		return delete(DELETE, obj);
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#DELETE(java.io.Serializable)
	 */
	public int DELETE(final Serializable  id){
		return delete(DELBYID, id);
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET(java.io.Serializable)
	 */
	public E GET(final Serializable id){
		return selectOne(GETBYID,ParamterMap.build("{id}",id));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET(java.util.Map)
	 */
	public E GET(final Map<String,Object> paramterMap){
		return selectOne(GETONE,ParamterMap.build(paramterMap));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET(com.huixin.common.core.entity.Entity)
	 */
	public E GET(final E obj){
		return selectOne(GETONE,ParamterMap.build(obj));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET(java.lang.String, java.lang.Object[])
	 */
	public E GET(final String keys, final Object... objs){
		return (E)selectOne(GETONE,ParamterMap.build(keys,objs));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET_LIST()
	 */
	public List<E> GET_LIST(){
		return selectList(FINDALL,ParamterMap.build());
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET_LIST(com.huixin.common.core.entity.Entity)
	 */
	public List<E> GET_LIST(final E obj){
		return selectList(FINDALL,ParamterMap.build(obj));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET_LIST(java.util.Map)
	 */
	public List<E> GET_LIST(final Map<String,Object> paramterMap){
		return selectList(FINDALL,ParamterMap.build(paramterMap));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#GET_LIST(java.lang.String, java.lang.Object[])
	 */
	public List<E> GET_LIST(final String keys, final Object... objs){
		return selectList(FINDALL,ParamterMap.build(keys,objs));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#COUNT()
	 */
	public Long COUNT(){
		return count(GETCOUNT,ParamterMap.build());
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#COUNT(java.util.Map)
	 */
	public Long COUNT(final Map<String,Object> paramterMap){
		return count(GETCOUNT,ParamterMap.build(paramterMap));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#COUNT(com.huixin.common.core.entity.Entity)
	 */
	public Long COUNT(final E obj){
		return count(GETCOUNT,ParamterMap.build(obj));
	}
	/* (non-Javadoc)
	 * @see com.huixin.common.core.dao.DAO#COUNT(java.lang.String, java.lang.Object[])
	 */
	public Long COUNT(final String keys, final Object... objs){
		return count(GETCOUNT,ParamterMap.build(keys,objs));
	}
	/**
	 * @param mapper mapper
	 * @param paramterMap map集合
	 * @param mapKey 主键字段名
	 * @return
	 */
	public Map<String,E> GET_MAP(final String mapper, final Map<String,Object> paramterMap, final String mapKey){
		return sqlSession.selectMap(mapper, ParamterMap.build(paramterMap), mapKey);
	}
	/**
	 * @param mapper mapper
	 * @param mapKey 主键字段名
	 * @param keys "{A}{B}{C}..."
	 * @param objs A,B,C...
	 * @return
	 */
	public Map<String,E> GET_MAP(final String mapper, final String mapKey, final String keys, final Object... objs){
		return sqlSession.selectMap(mapper, ParamterMap.build(keys,objs), mapKey);
	}
	/**
	 * mybatise 添加一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int insert(String methodName, Object parameter){
		return sqlSession.insert(mapperName+methodName, parameter);
	}
	/**
	 * mybatise 删除一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int delete(String methodName, Object parameter){
		return sqlSession.delete(mapperName+methodName, parameter);
	}
	/**
	 * mybatise 更新一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public int update(String methodName, Object parameter){
		return sqlSession.update(mapperName+methodName, parameter);
	}
	/**
	 * mybatise 获取一条数据
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public E selectOne(String methodName, Object parameter){
		return (E)sqlSession.selectOne(mapperName+methodName, parameter);
	}
	/**
	 * mybatise 获取多条数据集合
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public List<E> selectList(String methodName, Object parameter){
		return sqlSession.selectList(mapperName+methodName, parameter);
	}
	/**
	 * mybatise 获取多条数据条数
	 * @param methodName 对应mapper中的id
	 * @param parameter 传递的参数
	 * @return
	 */
	public Long count(String methodName, Object parameter){
		return (Long)sqlSession.selectList(mapperName+methodName, parameter).get(0);
	}
}
