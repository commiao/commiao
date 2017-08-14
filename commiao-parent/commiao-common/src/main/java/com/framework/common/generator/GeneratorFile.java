package com.framework.common.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.file.FileTool;
import com.framework.common.utils.StringUtils;

public class GeneratorFile {
	
	private String BASE_PATH = System.getProperty("user.dir")+"\\temple";;
	private String NEW_FILE = System.getProperty("user.dir")+"\\repidcode";
	
	private String POJO_BAG;//实体类包名
	private String VIEW_BAG;//页面包名
	private String VIEW_TITLE;//页面名字
	
	private void getInstance(Table table){
		VIEW_TITLE = getViewTitle(getClassTitle(table.getTableTitle()));
		VIEW_BAG = getViewBag(table.getTableTitle());
		POJO_BAG = getPojoBag(table.getTableTitle());
	}
	/**
	 * @param basePath 模板路径
	 * @param newFile 生成路径
	 */
	public GeneratorFile(String basePath, String newFile) {
		if(!StringUtils.isBlank(basePath)){
			BASE_PATH = basePath;
		}
		if(!StringUtils.isBlank(newFile)){
			NEW_FILE = newFile;
		}
	}

	/**
	 * 生成代码
	 * @param table
	 */
	public void create(Table table){
		getInstance(table);
		List<String> fileNames = FileTool.getFileNamesFromdir(BASE_PATH);
		for(String fileName:fileNames){
			modifyFile(fileName,table);
		}
	}

	/**
	 * 修改文件内容
	 * @param fileName
	 * @param table
	 */
	private void modifyFile(String fileName, Table table) {

		// 将文件内容按行存到list;
		List<String> old_list = FileTool.readFileToList(BASE_PATH + "\\" + fileName);
		String s = null;
		List<String> final_list = new ArrayList<String>();
		// 为注释行的标示
		int commentFlag = 0;
		for (int j = 0; j < old_list.size() - 1; j++) {
			// 使用循环把行字符串取出来,并调用replaceall函数,对字符内容进行正则表达式替换
			s = replaceWord(old_list.get(j), table);
			if (s.indexOf("//") >= 0 || s.indexOf("*") >= 0) {
				s = s + " ";
				commentFlag = 1;
			} else if (!"".equals(s.trim())) {
				commentFlag = 0;
			}
			// 如果前一行为注释行，该行为空行则删除
			if (commentFlag == 1) {
				if (!"".equals(s.trim())) {
					final_list.add(s);
				}
			} else {
				final_list.add(s);
			}
		}
		// 替换新文件名
		String newFileName = fileName.replace("{CLASS_TITLE}", getClassTitle(table.getTableTitle()));
		newFileName = newFileName.replace("{VIEW_TITLE}", VIEW_TITLE);
		newFileName = newFileName.replace("{VIEW_BAG}", VIEW_BAG);
		
		File newFile = FileTool.createFile(NEW_FILE + "\\" + newFileName);
		// 将内容写到新文件
		FileTool.writeFileFromList(newFile, final_list);

	}
	
	/**
	 * 替换字符串
	 * @param oldWord 将要替换的内容
	 * @param table 数据库table对象
	 * @return
	 */
	private String replaceWord(String oldWord, Table table){
		String keyTitle = table.getPrimaryKeys().get(0).getKeyTitle();
		String str = "";
		str = oldWord.replace("{CLASS_TITLE}", getClassTitle(table.getTableTitle()));
		oldWord = str;
		str = oldWord.replace("{CLASS_NAME}", getClassName(table.getTableTitle()));
		oldWord = str;
		str = oldWord.replace("{POJO_BAG}", POJO_BAG);
		oldWord = str;
		str = oldWord.replace("{VIEW_BAG}", VIEW_BAG);
		oldWord = str;
		str = oldWord.replace("{VIEW_TITLE}", VIEW_TITLE);
		oldWord = str;
		str = oldWord.replace("{TABLE_NAME}", table.getTableTitle());
		oldWord = str;
		str = oldWord.replace("{PRIMARY_KEY}",keyTitle);
		oldWord = str;
		str = oldWord.replace("{PRIMARY_NAME}",getClassName(keyTitle));
		oldWord = str;
		str = oldWord.replace("{KEY_NAME}",getClassName(keyTitle));
		oldWord = str;
		str = oldWord.replace("{JAVA_PROPERTY}",getProperty(table,"java_property"));
		oldWord = str;
		str = oldWord.replace("{JAVA_METHOD}",getProperty(table,"java_method"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_RESULT}",getProperty(table,"mapper_result"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_CLOUMN_LIST}",getProperty(table,"mapper_cloumn_list"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_PROPERTY_LIST}",getProperty(table,"mapper_property_list"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_UPDATE}",getProperty(table,"mapper_update"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_ALL}",getProperty(table,"mapper_all"));
		oldWord = str;
		str = oldWord.replace("{MAPPER_QUERY}",getProperty(table,"mapper_query"));
		oldWord = str;
		return oldWord;
	}
	
	private String getProperty(Table table,String type){
		List<Column> list = table.getColumns();
		final String primaryKey = table.getPrimaryKeys().get(0).getKeyTitle();
		StringBuffer str = new StringBuffer();
		int i = 0;
		String propertyTitle = "";
		String propertyName = "";
		for(Column column:list){
			propertyTitle = getClassTitle(column.getColumnTitle());
			propertyName = getClassName(column.getColumnTitle());
			i++;
			if("java_property".equals(type)){
				str.append("\t").append("private String ").append(propertyName).append(";\n");
			}
			if("java_method".equals(type)){
				str.append("\t").append("public String get").append(propertyTitle).append("() {\n")
				.append("\t\t").append("return ").append(propertyName).append(";\n\t}\n");
				str.append("\t").append("public void set").append(propertyTitle).append("(String ").append(propertyName).append(") {\n")
				.append("\t\t").append("this.").append(propertyName).append(" = ").append(propertyName).append(";\n")
				.append("\t}\n");
			}
			if("mapper_result".equals(type)){
				if(i!=1){
					str.append("\t\t");
				}
				str.append("<result column=\"").append(column.getColumnTitle()).append("\" property=\"").append(propertyName).append("\" />\n");
			}
			if("mapper_cloumn_list".equals(type) && !primaryKey.equals(column.getColumnTitle())){
				str.append(column.getColumnTitle());
				if(i!=list.size()){
					str.append(",");
				}
			}
			if("mapper_property_list".equals(type) && !primaryKey.equals(column.getColumnTitle())){
				str.append("#{").append(propertyName).append("}");
				if(i!=list.size()){
					str.append(",");
				}
			}
			if("mapper_update".equals(type) && !primaryKey.equals(column.getColumnTitle())){
				if(i!=1){
					str.append("\t\t\t");
				}
				str.append("<if test=\"").append(propertyName).append("!=null\">\n");
				str.append("\t\t\t\t").append(column.getColumnTitle()).append("=#{").append(propertyName).append("}");
				if(i!=list.size()){
					str.append(",");
				}
				str.append("\n\t\t\t").append("</if>\n");
			}
			if("mapper_all".equals(type)){
				str.append(column.getColumnTitle());
				if(i!=list.size()){
					str.append(",");
				}
			}
			if("mapper_query".equals(type)){
				if(i!=1){
					str.append("\t\t");
				}
				str.append("<if test=\"").append(propertyName).append("!= null\">\n");
				str.append("\t\t\t").append("and ").append(column.getColumnTitle()).append("=#{").append(propertyName).append("}\n");
				str.append("\t\t").append("</if>\n");
			}
		}
		return str.toString();
	}
	
	/**
	 * 获取实体类所属包名
	 * @param tableName
	 * @return
	 */
	private String getPojoBag(String tableName){
		return StringUtils.toCamelCase(tableName.substring(0, tableName.indexOf("_")));
	}
	
	/**
	 * 获取视图页面所属细分包名
	 * @param tableName
	 * @return
	 */
	private String getViewBag(String tableName){
		return StringUtils.toCamelCase(tableName.substring(tableName.indexOf("_")+1));
	}
	
	/**
	 * 获取视图页面前缀名
	 * @param classTitle
	 * @return
	 */
	private String getViewTitle(String classTitle){
		StringBuffer start = new StringBuffer(StringUtils.toUnderScoreCase(classTitle,"-"));
		return start.append("-").toString();
	}
	/**
	 * 驼峰命名（首字母小写）
	 * @param tableTitle 数据库 字段或表 名
	 * @return
	 */
	public String getClassName(String tableTitle) {
		return StringUtils.toCamelCase(tableTitle);
	}
	/**
	 * 驼峰命名（首字母大写）
	 * @param tableTitle 数据库 字段或表 名
	 * @return
	 */
	public String getClassTitle(String tableTitle){
		return StringUtils.toCamelCase(tableTitle,true);
	}
}
