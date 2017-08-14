package com.components.dao.impl.file;

import org.springframework.stereotype.Repository;

import com.components.dao.file.FileManagerDao;
import com.components.domain.pojo.file.FileManager;
import com.framework.common.core.dao.MybatisDAOSupport;

@Repository("fileManagerDao")
public class FileManagerDaoImpl extends MybatisDAOSupport<FileManager> implements FileManagerDao {

}
