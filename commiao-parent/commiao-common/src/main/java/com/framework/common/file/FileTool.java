package com.framework.common.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTool {
	
	/**
	 * 检查文件路径是否存在 不存在即创建
	 * @param dirPath
	 */
	public static void checkDir(String path){
		System.out.println(path);
		File file =new File(path);    
		//如果文件夹不存在则创建    
		if  (!file .exists()  && !file .isDirectory()){       
		    System.out.println("//不存在");  
		    file .mkdirs();    
		}else{  
		    System.out.println("//目录存在");  
		}  
	}
	
	/**
	 * 创建File（如果不存在文件夹，即创建文件夹）
	 * @param filePath
	 * @return
	 */
	public static File createFile(String filePath){
		File file = new File(filePath);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("create file error");  
		}
		return file;
	}
	
	/**
	 * 读取给定目录下的所有文件
	 * @param dir_path 指定文件夹路径
	 * @return
	 */
	public static List<String> getFileNamesFromdir(String dir_path) {
		List<String> list = new ArrayList<String>();
		File dir = new File(dir_path);
		File[] files = dir.listFiles();
		if (files == null) return null;
		for (int i = 0; i < files.length; i++) {
			// 判断此文件是否是一个文件
			if (!files[i].isDirectory()) {
				System.out.println(files[i].getName());
				list.add(files[i].getName());
			}
		}
		return list;
	}
	
	/**
	 * 将文件内容按行存到list
	 * @param filePath 文件路径
	 * @return
	 */
	public static List<String> readFileToList(String filePath) {
		List<String> list = new ArrayList<String>();
		try {
			// 读取文件
			BufferedReader file_pwd = new BufferedReader(new FileReader(filePath));
			// 声明读文件行的临时变量
			String temp;
			do {// 按行循环读取文件
				temp = file_pwd.readLine();
				// 把读取到的行存入数组变量
				list.add(temp);
			} while (temp != null);
			file_pwd.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("file read error");
		}
		return list;
	}
	
	/**
	 * 将list中的内容 按行写入文件中
	 * @param file 新文件
	 * @param list 包含写入内容（按行输出）的list集合
	 */
	public static void writeFileFromList(File file, List<String> list) {
		try {
			BufferedWriter file_bak = new BufferedWriter(new FileWriter(file));
			for (int j = 0; j < list.size() - 1; j++) {
				file_bak.write(list.get(j).replace(" ", "    ") + "\n");
			}
			// 必须先刷新,才能用close关闭
			file_bak.flush();
			file_bak.close();
			System.out.println("file write success");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("file write error");
		}
	}
	
    /**
     * 返回文件名的扩展名
     * @param fileName 文件名
     * @return 扩展名
     */
    public static String getFileExt(String fileName){

        if(fileName == null)
            return null;
        int pos = fileName.lastIndexOf('.');
        if(pos > 0){
            return fileName.substring(pos+1, fileName.length());
        }else{
            return "";
        }
    }
    
    /**
     * 获得有效的文件名，如果重名，则在文件名后面加入[index]
     * @param fileName 文件名
     * @return 不重名的文件名
     */
    public static String getValidFileName(String fileName){
    	File file = new File(fileName);
    	while(file.exists()){
    		fileName = getNextFile(fileName);
    		file = new File(fileName);
    	}
    	return fileName;
    }
    
    /**
     * 返回下一个文件名，如果包含[index]，则index加一，否则返回文件名[1]
     * @param fileName 原始文件名
     * @return 下一个文件名
     */
    public static String getNextFile(String fileName){
    	StringBuffer sb = new StringBuffer();
    	//分别获得文件的名称和扩展名
    	String ext = getFileExt(fileName);
    	String shortName = getFileShortName(fileName);
    	//得到[的位置，如果包含[和]则认为文件后面有脚标
    	int pos = shortName.lastIndexOf('[');
    	if(shortName.endsWith("]") && pos>0){
    		String sureName = shortName.substring(0,pos);
    		int index = Integer.valueOf(shortName.substring(pos+1,shortName.length()-1));
    		sb.append(sureName).append("[").append(index+1).append("]");
    	}else{
    		sb.append(shortName).append("[1]");
    	}
    	//如果含有扩展名则加入
    	if(ext!=null && !ext.equals("")){
    		sb.append(".").append(ext);
    	}
    	return sb.toString();
    }
    
    /**
     * 返回带有路径文件名中的文件名部分
     * @param fileName 带有路径的文件名
     * @return 文件名
     */
    public static String getFileShortName(String fileName){
    	String name = getFileName(fileName);
        if(name == null )
            return "";
        int pos = name.lastIndexOf('.');
        if(pos > 0){
            return name.substring(0, pos);
        }else{
            return name;
        }
    }
    
    /**
     * 返回带有路径文件名中的文件名部分
     * @param fileName 带有路径的文件全名
     * @return 文件名+扩展名
     */
    public static String getFileName(String fileName){
        if(fileName == null)
            return "";
        int pos1 = fileName.lastIndexOf("/");
        int pos2 = fileName.lastIndexOf("\\");
        int pos = pos1 > pos2 ? pos1 : pos2;
        
        if(pos > -1){
            return fileName.substring(pos+1, fileName.length());
        }else{
            return fileName;
        }
    }
}
