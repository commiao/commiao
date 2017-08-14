package com.components.service.impl.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.components.dao.file.FileManagerDao;
import com.components.service.file.FileManagerService;
import com.components.domain.pojo.file.FileManager;
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
