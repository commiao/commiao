package com.framework.common.generator;

import com.framework.common.database.metaData.MetaDataHelper;

public class GeneratorHelper {
	
	/**
	 * 生成代码(指定数据库中单表)
	 * @param tableNamePattern 表名
	 * @param basePath 模板路径
	 * @param newFile 生成路径
	 */
	public static void createFile(String tableNamePattern, String basePath, String newFile){
		GeneratorFile gf = new GeneratorFile(basePath,newFile);
		gf.create(MetaDataHelper.getTable(tableNamePattern));
	}
	
	/**
	 * 生成代码(单表)“hxja”“D:\\aa”“D:\\bb”
	 * @param tableNamePattern 表名
	 */
	public static void createFile(String tableNamePattern){
		createFile(tableNamePattern, "D:\\aa", "D:\\bb");
	}
	
}
