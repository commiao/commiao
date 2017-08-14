package com.components.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.components.file.domain.model.Json;
import com.components.file.domain.pojo.FileManager;
import com.components.file.service.FileManagerService;
import com.framework.common.core.controller.SpringControllerSupport;
import com.framework.common.file.FileTool;
import com.framework.common.file.FileUpload;
import com.framework.common.file.model.UploadModel;

@Controller
@RequestMapping("/components/file")
public class FileUploadController extends SpringControllerSupport{
	@Autowired
	private FileManagerService fileManagerService;
	
	@RequestMapping(value = "/upload/save")
	public void save(@RequestParam(value = "savePath", required = false) final String savePath){
		Json j = new Json();
//      String qqfileFileName = ParameterUtils.getString(request, "qqfilename");
		UploadModel model = FileUpload.save(savePath, request);
        if(model.getSuccess()){
        	//保存成功以后，存储记录
        	FileManager fileManager = new FileManager();
        	fileManager.setFilePath(model.getFileName());
        	fileManager.setFileRealname(FileTool.getFileName(model.getFileFullPath()));
        	fileManagerService.save(fileManager);	
        	j.setSuccess(true);
        	j.setObj(fileManager);
        }else{
        	j.setSuccess(false);
			j.setMsg(j.toString());
        }
        writeJson(j);
	}
	
}
