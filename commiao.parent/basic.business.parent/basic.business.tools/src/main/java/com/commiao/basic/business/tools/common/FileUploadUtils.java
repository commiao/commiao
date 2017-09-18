package com.commiao.basic.business.tools.common;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * CreateDate:2017年1月3日下午2:27:44 
 * @Description: 文件上传工具类 
 * @author:shl
 * @version V1.0   
 */
public class FileUploadUtils {
	/**日志*/
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtils.class);
	
	/**
	 * 
	 * @Description:文件上传（文件保存）
	 * @author shl
	 * @param request
	 * @param fileRootPath - 文件实际存储根路径
	 * @param fileAccessPath - 文件访问路径(存储在数据库中)
	 * @param maxLength - 文件大小上限，不限制则传null
	 * @param allowExtName - 允许上传的文件类型，无则传null 数组类型，例如：{jpg,png,gif}
	 * @return
	 * @throws Exception
	 */
	public static List<FileUploadBean> uploadFiles(HttpServletRequest request, String fileRootPath, String fileAccessPath, 
			Long maxLength, String[] allowExtName) throws Exception{
		MultipartHttpServletRequest muitiHttpServletRequest = (MultipartHttpServletRequest)request;
		Iterator<String> iterator = muitiHttpServletRequest.getFileNames();
		List<FileUploadBean> retFileList = new ArrayList<FileUploadBean>();
		FileUploadBean fileUploadBean = null;
		//文件集合
		List<MultipartFile> mutiMultipartFiles = null;
		//新文件名称
		String newFileName = null;
		//文件实际存储路径
		String fileAllPath = null;
		while(iterator.hasNext()){
			fileUploadBean = new FileUploadBean();
			mutiMultipartFiles = muitiHttpServletRequest.getFiles(iterator.next());
			if(mutiMultipartFiles != null && mutiMultipartFiles.size() > 0){
				for(MultipartFile multipartFile : mutiMultipartFiles){
					if(multipartFile != null && !multipartFile.isEmpty()){
						String fileName = multipartFile.getOriginalFilename();
						long fileSize = multipartFile.getSize();
						fileUploadBean.setOriginalFile(fileName);
						fileUploadBean.setFileSize(fileSize);
						fileUploadBean.setEmptyByte(false);
						//校验文件是否符合规则
						if(validateFile(multipartFile, maxLength, allowExtName)){
							fileUploadBean.setCompliance(true);
							String extension = FilenameUtils.getExtension(fileName);
							newFileName = UUID.randomUUID()+"."+extension;
							fileUploadBean.setNewFileName(newFileName);
							fileAllPath = fileRootPath+File.separator+fileAccessPath+File.separator+newFileName;
							fileUploadBean.setFileAccessPath(fileAccessPath+File.separator+newFileName);
							fileUploadBean.setFileStoragePath(fileAllPath);
							logger.debug("原始文件名称:{}",fileName);
							logger.debug("新的文件名称:{}",newFileName);
							logger.debug("文件实际存储路径:{}",fileAllPath);
							logger.debug("文件访问路径:{}",fileAccessPath+File.separator+newFileName);
							File localFile = new File(fileAllPath);
							if(!localFile.exists()){
								localFile.mkdirs();
							}
							// 写文件到本地
							multipartFile.transferTo(localFile);
						}else{
							fileUploadBean.setCompliance(false);
						}
					}else{
						fileUploadBean.setEmptyByte(true);
					}
					retFileList.add(fileUploadBean);
				}
			}
		}
		return retFileList;
	}
	
	/**
	 * 
	 * @Description：校验文件类型
	 * @author shl
	 * @param file
	 * @param maxLength
	 * @param allowExtName
	 * @return
	 */
	public static boolean validateFile(MultipartFile file, Long maxLength,
            String[] allowExtName) {
		logger.debug("[文件校验]-文件原始名:{},文件大小:{}", file.getOriginalFilename(), file.getSize());
        if (maxLength != null && file.getSize() > maxLength){
        	logger.error("[文件校验]-大小超过上限:{},当前文件大小:{}", maxLength, file.getSize());
        	return false;
        }
        String filename = file.getOriginalFilename();
        // 处理不选择文件点击上传时，也会有MultipartFile对象，在此进行过滤
        if (filename == "") {
            return false;
        }
        String extName = filename.substring(filename.lastIndexOf("."))
                .toLowerCase();
        if (allowExtName == null || allowExtName.length == 0
                || Arrays.binarySearch(allowExtName, extName) != -1) {//使用二分搜索法，搜索数组中，是否含有指定对象，含有则返回索引，否则返回-1
            return true;
        } else {
        	logger.error("[文件校验]-不支持的文件类型:{}", extName);
            return false;
        }
    }
	
	
	/**
	 * 浏览器兼容
	 */
	public static String getBrowser(HttpServletRequest request) {  
        String userAgent = request.getHeader("USER-AGENT").toLowerCase();  
        if (userAgent != null) {
        	//IE7+浏览器判断方式(包括edge浏览器)
            if (userAgent.contains("msie") 
            		|| userAgent.contains("trident") 
            		|| userAgent.contains("edge"))  
                return "IE";  
            if (userAgent.contains("firefox"))  
                return "FF";  
            if (userAgent.contains("safari"))  
                return "SF";  
        }  
        return null;  
    }
	
	/**
	 * 浏览器文件名乱码兼容
	 * @param fileName
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static  String downLoadFileName(String fileName,HttpServletRequest request) throws UnsupportedEncodingException{
		//IE浏览器
		if ("IE".equals(getBrowser(request))) {  
        	fileName = URLEncoder.encode(fileName, "UTF-8");
        }else{
        	fileName = new String(fileName.getBytes("UTF-8"),  "ISO-8859-1");
        }
		return fileName;
	}
	
}
