package com.commiao.domain.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtils {
	
	/**
	 * @param savedir 最终保存的文件路径（不包含文件名）
	 * @param fileName 将要保存的文件名
	 * @param uploadFile 上传的源文件
	 * @return
	 * @throws Exception
	 */
	public static File saveFile(File savedir, String fileName, File uploadFile)
			throws Exception {
		if (!savedir.exists()) savedir.mkdirs();// 如果目录不存在就创建
		File file = new File(savedir, fileName);// 创建最终保存的空文件（容器）
		// 将源文件写入将要保存的文件中
		FileOutputStream fileoutstream = new FileOutputStream(file);
		FileInputStream input = new FileInputStream(uploadFile);
		byte[] bytes = new byte[1024];
		int length = 0;
		while ((length = input.read(bytes)) != -1) {
			fileoutstream.write(bytes, 0, length);
		}
		fileoutstream.flush();
		fileoutstream.close();
		input.close();
		return file;
	}

	public static void main(String[] args) {
//		String str = "ajdashjda.jpg";
//		String fileName = str.substring(0,str.lastIndexOf("."));
//		System.out.println(fileName);
		String date = DateUtils.getCurrentTimeStr();
		
		System.out.println(date);
	}
}
