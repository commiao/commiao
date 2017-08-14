package com.components.file.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.file.dao.FileManagerDao;
import com.components.file.service.FileManagerService;
import com.components.file.domain.pojo.FileManager;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

@Repository("fileManagerService")
public class FileManagerServiceImpl extends ServiceSupport<FileManager> implements FileManagerService {

	@Autowired
	private FileManagerDao fileManagerDao;

	@Override
	public DAO<FileManager> getDao() {
		return fileManagerDao;
	}

}
