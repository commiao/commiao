package com.framework.common.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.framework.common.file.model.UploadModel;
import com.framework.common.utils.DateTimeUtils;

public class FileUpload {
	public static UploadModel save(String savePath,HttpServletRequest request){
		UploadModel uploadModel = new UploadModel();
		Boolean uploadSuccess = true;
		String fileFullPath = "";//文件存储的名
		String fileName = "";//文件标题
		// 上传路径 根目录（与 WEB-INF 平级）
		String uploadPath = request.getSession().getServletContext().getRealPath("/");
        uploadPath += savePath;
		try {
			//检验文件路径（不存在则创建）
			FileTool.checkDir(uploadPath);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
        MultipartHttpServletRequest fileRequest = (MultipartHttpServletRequest)request;
        List<MultipartFile> files = fileRequest.getFiles("qqfile");
        InputStream is = null;
        FileOutputStream fos = null;
        try {
        	for (MultipartFile myfile : files){ 
        		fileName = myfile.getOriginalFilename();
                is = myfile.getInputStream();
                fileFullPath = getFileValidName(uploadPath, fileName, true, true);
                fos = new FileOutputStream(new File(fileFullPath));
                IOUtils.copy(is, fos);
            }
        } catch (FileNotFoundException ex) {
        	uploadSuccess = false;
    		ex.printStackTrace();
        } catch (Exception ex) {
        	uploadSuccess = false;
    		ex.printStackTrace();
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException ignored) {
            	ignored.printStackTrace();
            }
        }
        uploadModel.setFileName(fileName);
        uploadModel.setFileFullPath(fileFullPath);
        uploadModel.setSuccess(uploadSuccess);
        return uploadModel;
	}
	
	private static String getFileValidName(String filePath, String fileName,boolean format, boolean overwrite ){
		String fileValidName;
		if(format){
			String fileExt = FileTool.getFileExt(fileName);
			fileValidName =  filePath + DateTimeUtils.getCurrentDateTimeString("yyyyMMddHHmmss") + (fileExt==null?"":"."+fileExt);
    	}else{
    		fileValidName =  filePath + fileName;
    	}
		if( !overwrite ){
			fileValidName = FileTool.getValidFileName(fileValidName);
		}
		return fileValidName;
	}
	
}
