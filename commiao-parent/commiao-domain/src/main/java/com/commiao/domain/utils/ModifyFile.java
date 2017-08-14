package com.commiao.domain.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModifyFile {
	
	private static String OLD_FILE = "D:\\aa";
	private static String NEW_FILE = "D:\\bb";
	private static String CLASS_NAME = "User";
	private static String POJO_BAG = "user";
	
	/**
	 * @param templatePath 样板路径（D:\\aa）
	 * @param codePath （生成路径D:\\bb）
	 * @param className （类名字abc或Abc）
	 * @param pojoBag （实体类所在pojo包名称）
	 */
	public ModifyFile(String templatePath, String codePath, String className, String pojoBag) {
		OLD_FILE = templatePath;
		NEW_FILE = codePath;
		CLASS_NAME = className;
		POJO_BAG = pojoBag;
	}
	
	/**
	 * @param className （类名字abc或Abc）
	 * @param pojoBag（实体类所在pojo包名称）
	 */
	public ModifyFile(String className, String pojoBag){
		CLASS_NAME = className;
		POJO_BAG = pojoBag;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("TradeReistSuccessLog");
		list.add("TradeLendMoneyLog");
		list.add("TradeRegistRepayLog");
		list.add("TradeRepayMoneyLog");
		for(String str:list){
			ModifyFile mf = new ModifyFile(str, "trade");
			mf.generate();
		}
	}
	
	public void generate(){
		try {
			// 读取给定目录下的所有文件
			File dir = new File(OLD_FILE);
			File[] files = dir.listFiles();
			if (files == null)return;
			// 文件名
			String fileName = "";
			for (int i = 0; i < files.length; i++) {
				// 判断此文件是否是一个文件
				if (!files[i].isDirectory()) {
					System.out.println(files[i].getName());
					fileName = files[i].getName();
					modifyFile(fileName);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("file read or write error");
		}
	}

	private void modifyFile(String fileName) {
		try {
			// 文件路径
			String filePath = "";
			// 修改后新文件路径
			String newFilePath = "";
			filePath = OLD_FILE + "\\" + fileName;
			// 读取文件
			BufferedReader File_pwd = new BufferedReader(new FileReader(filePath));
			// 将文件内容按行存到list;
			List<String> list = new ArrayList<String>();
			// 声明读文件行的临时变量
			String temp;
			do {
				// 按行循环读取文件
				temp = File_pwd.readLine();
				System.out.println("读取到的原文件:" + temp);
				list.add(temp);
				// 把读取到的行存入数组变量
			} while (temp != null);
			File_pwd.close();
			// 将内容写到新文件
			String newFileName = fileName.replace("{CLASS_NAME}", firstWordUp(CLASS_NAME));
			newFilePath = NEW_FILE + "\\" + newFileName;
			BufferedWriter File_bak = new BufferedWriter(new FileWriter(new File(newFilePath)));
			String s = new String();
			// 为注释行的标示
			int commentFlag = 0;
			for (int j = 0; j < list.size() - 1; j++) {
				// 使用循环把行字符串取出来,并调用replaceall函数,对字符内容进行正则表达式替换
				s = replaceWord(list.get(j));
				if (s.indexOf("//") >= 0 || s.indexOf("*") >= 0) {
					s = s + " ";
					commentFlag = 1;
				} else if (!"".equals(s.trim())) {
					commentFlag = 0;
				}
				// 如果前一行为注释行，该行为空行则删除
				if (commentFlag == 1) {
					if (!"".equals(s.trim())) {
						s.replace(" ", "    ");
						File_bak.write(s + "\n");
					}
				} else {
					s.replace(" ", "    ");
					File_bak.write(s + "\n");
				}
			}
			// 必须先刷新,才能用close关闭
			File_bak.flush();
			File_bak.close();
			System.out.println("file write success");
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("file read or write error");
		}
	}
	
	/**
	 * 替换字符串
	 * @param oldWord
	 * @return
	 */
	private String replaceWord(String oldWord){
		String str = "";
		str = oldWord.replace("{CLASS_NAME}", firstWordUp(CLASS_NAME));
		oldWord = str;
		str = oldWord.replace("{NAME}", firstWordLow(CLASS_NAME));
		oldWord = str;
		str = oldWord.replace("{POJO_BAG}", POJO_BAG);
		oldWord = str;
		return oldWord;
	}
	
	/**
	 * 首字母转为大写
	 * @param name
	 * @return
	 */
	private String firstWordUp(String name) {
		char[] cs = name.toCharArray();
		if (cs[0] >= 'a' && cs[0] <= 'z') {
			cs[0] -= 32;
		}
		return String.valueOf(cs);

	}
	/**
	 * 首字符转为小写
	 * @param name
	 * @return
	 */
	private String firstWordLow(String name) {
		char[] cs = name.toCharArray();
		if (cs[0] >= 'A' && cs[0] <= 'Z') {
			cs[0] += 32;
		}
		return String.valueOf(cs);

	}
	
}
