package com.components.file.dao.impl;

import org.springframework.stereotype.Repository;

import com.components.file.dao.FileManagerDao;
import com.components.file.domain.pojo.FileManager;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("fileManagerDao")
public class FileManagerDaoImpl extends MybatisDAOSupport<FileManager> implements FileManagerDao {

}
