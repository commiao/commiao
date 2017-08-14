package com.components.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.components.file.domain.model.Json;
import com.components.file.domain.pojo.FileManager;
import com.components.file.service.FileManagerService;
import com.framework.common.core.controller.SpringControllerSupport;
import com.framework.common.utils.StringUtils;

@Controller
@RequestMapping("/components/file")
public class FileManagerController extends SpringControllerSupport {
	@Autowired
	private FileManagerService fileManagerService;

	/**
	 * 主页
	 * @param model
	 * @return
	 */
	@RequestMapping("/manager/index")
	public String index(Model model) {
		LOG.info("进入index页面");
		System.out.println("页面地址===="+getViewNamedPath("index"));
		return getViewNamedPath("index");
	}

	/**  
	 * 列表
	 * @param fileManager
	 */
	@RequestMapping("/manager/datagrid")
	public void datagrid(FileManager fileManager) {
		writeJson(fileManagerService.getDatagrid(fileManager));
	}
	
	/**
	 * 上传页面
	 * @return
	 */
	@RequestMapping("/manager/add")
	public String add(){
		return getViewNamedPath("add");
	}
	
	@RequestMapping("/manager/save")
	public void save(FileManager fileManager){
		Json j = new Json();
		try {
			if(!fileManager.isNew() && !StringUtils.isBlank(fileManager.getFileTitle())){
				FileManager fm = fileManagerService.getById(fileManager.getId());
				fm.setFileTitle(fileManager.getFileTitle());
				fileManagerService.update(fileManager);
				j.setSuccess(true);
				j.setMsg("保存成功！");
			}else{
				j.setSuccess(true);
				j.setMsg("未做修改！");
			}
		} catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("保存错误！");
			LOG.info(e.toString());
		}
		writeJson(j);
	}
}