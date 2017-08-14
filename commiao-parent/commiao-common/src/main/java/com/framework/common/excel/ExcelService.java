package com.framework.common.excel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.ValidationException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.core.domain.model.json.MessageJson;
import com.framework.common.core.domain.model.json.MessageJson.MessageResult;
import com.framework.common.core.domain.model.json.MessageJson.MessageType;
import com.framework.common.utils.StringUtils;

/**
 * @author jingmiao
 *	excel操作接口
 */
public class ExcelService {
	/**
	 * 将首行有字段名的excel内容转换为数据库Table对象
	 * @param fileUrl 将要读取的excel文件位置
	 * @return
	 * @throws ValidationException
	 */
	public static MessageJson getTableByExcel(String fileUrl){
		MessageJson json = new MessageJson(MessageResult.success, MessageType.information, "将excel转换table对象，成功");
		Workbook workbook = null;
		Sheet sheet = null;
		int length = 0;
		try {
			workbook = Workbook.getWorkbook(new File(fileUrl));
			sheet = workbook.getSheet(0);
			length = sheet.getRows();
		} catch (Exception ex) {
			ex.printStackTrace();
			json.setType(MessageType.error);
			json.setResult(MessageResult.fail);
			json.setMessage("校验失败，导入的文件可能是非Excel格式的合法文件，请尝试重新导入新的excel文件!");
			return json;
		}
		Cell cell = null;
		if (sheet != null && sheet.getColumns() < 1) {
			json.setType(MessageType.error);
			json.setResult(MessageResult.fail);
			json.setMessage("校验失败，导入Excel文件的列数不能小于1!");
			return json;
		}
		// 将excel内容转换为Table对象
		Table table = new Table();
		// 判断是否是首行
		boolean isFirst = true;
		// 首行字段集合
		List<Column> columns = new ArrayList<Column>();
		// 从第2行开始的数据集合
		List<HashMap<String, Object>> dataCollection = new ArrayList<HashMap<String, Object>>();
		// 每行数据（字段名，值）的map集合
		HashMap<String, Object> data_map = null;
		// 每个数据的值
		String data = null;
		// 校验信息
		StringBuffer errMsg = new StringBuffer();
		for (int i = 0; i < length; i++) {
			data_map = new HashMap<String, Object>();
			for (int j = 0; j < sheet.getColumns(); j++) {
				cell = sheet.getCell(j, i);
				if (StringUtils.isBlank(cell.getContents())) {
					errMsg.append("第").append(i + 1).append("行，第").append(j + 1).append("列,");
					data = "";
				} else {
					data = cell.getContents().trim();
				}
				if (isFirst) {// 处理第一行 标题
					if (i == 0) {
						columns.add(j, new Column(data));
					} else {
						isFirst = false;
						data_map.put(columns.get(j).getColumnTitle(), data);
					}
				} else {// 从第二行起处理 数据
					data_map.put(columns.get(j).getColumnTitle(), data);
				}
			}
			if (!isFirst) {// 从第二行开始插入
				dataCollection.add(i-1, data_map);
			}
		}
		if(!StringUtils.isBlank(errMsg.toString())){
			json.setType(MessageType.warning);
			json.setResult(MessageResult.success);
			json.setMessage(errMsg.toString());
		}
		table.setColumns(columns);
		table.setDataCollection(dataCollection);
		json.setItem(table);
		return json;
	}

	/**
	 * 将数据库Table对象写入excel文件
	 * @param fileUrl 将要写入的excel文件路径 "D://book001.xls"
	 * @param table 数据库table对象
	 * @return
	 */
	public static MessageJson setTableToExcel(String fileUrl, Table table) {
		MessageJson json = new MessageJson(MessageResult.success, MessageType.information, "将table对象写入excel，成功");
		try {
			WritableWorkbook workbook = null;
			// 创建可写入的Excel工作簿
			File file = new File(fileUrl);
			if (!file.exists()) {
				file.createNewFile();
			}
			// 以fileName为文件名来创建一个Workbook
			workbook = Workbook.createWorkbook(file);
			// 创建工作表
			WritableSheet sheet = workbook.createSheet("Test Shee 1", 0);
			// 查询数据库中所有的数据
			List<Column> columns = table.getColumns();
			List<HashMap<String, Object>> datas = table.getDataCollection();
			if(datas==null || datas.size()<1){
				json.setType(MessageType.error);
				json.setResult(MessageResult.fail);
				json.setMessage("校验失败，写入excel文件的数据不能小于1条!");
				return json;
			}
			// 验证是否存在第一行列标题
			Boolean hasFirst = columns == null || columns.size() < 1 ? false : true;
			// 验证将要输入到excel文件的数据总条数
			int total_rows = hasFirst ? datas.size() + 1 : datas.size();
			Label lable = null;
			if(hasFirst){
				for (int j = 0; j < columns.size(); j++) {
					lable = new Label(j, 0, columns.get(j).getColumnTitle());
					sheet.addCell(lable);
				}
				for (int i = 1; i < total_rows; i++) {
					for (int j = 0; j < columns.size(); j++) {
						lable = new Label(j, i, datas.get(i-1).get(columns.get(j).getColumnTitle()).toString());
						sheet.addCell(lable);
					}
				}
			}else{
				for (int i = 0; i < total_rows; i++) {
					for (int j = 0; j < columns.size(); j++) {
						lable = new Label(j, i, datas.get(i).get(columns.get(j).getColumnTitle()).toString());
						sheet.addCell(lable);
					}
				}
			}
			// 写进文档
			workbook.write();
			// 关闭Excel工作簿对象
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	/**
	 * 获取指定行列的数据
	 * @param fileUrl
	 * @param row_index
	 * @param column_index
	 * @return
	 */
	public static String getCotentByRowAndColumn(String fileUrl,int row_index,int column_index){
		List<String> row = getRowByIndex(fileUrl, row_index);
		String cotent = row.get(column_index);
		return cotent;
	}
	
	/**
	 * 获取指定一行的数据
	 * @param fileUrl
	 * @param row_index
	 * @return
	 */
	public static List<String> getRowByIndex(String fileUrl,int row_index){
		Workbook workbook = null;
		Sheet sheet = null;
		try {
			workbook = Workbook.getWorkbook(new File(fileUrl));
			sheet = workbook.getSheet(0);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		Cell cell = null;
		if(sheet != null && sheet.getColumns() < 1){
			return null;
		}
		List<String> row_data = new ArrayList<String>();
		String data = "";
		for(int x=0;x<sheet.getColumns();x++){
			cell = sheet.getCell(x, row_index);
			if (!StringUtils.isBlank(cell.getContents())) {
				data = cell.getContents().trim();
			}
			row_data.add(x, data);
		}
		return row_data;
	}
	
	/**
	 * 将excel转换成List[List[Object]]格式
	 * @param fileUrl
	 * @return
	 */
	public static MessageJson getListByExcel(String fileUrl){
		MessageJson json = new MessageJson(MessageResult.success, MessageType.information, "将excel转换list集合，成功");
		Workbook workbook = null;
		Sheet sheet = null;
		int row_size = 0;
		try {
			workbook = Workbook.getWorkbook(new File(fileUrl));
			sheet = workbook.getSheet(0);
			row_size = sheet.getRows();
		} catch (Exception ex) {
			ex.printStackTrace();
			json.setType(MessageType.error);
			json.setResult(MessageResult.fail);
			json.setMessage("校验失败，导入的文件可能是非Excel格式的合法文件，请尝试重新导入新的excel文件!");
			return json;
		}
		Cell cell = null;
		if (sheet != null && sheet.getColumns() < 1) {
			json.setType(MessageType.error);
			json.setResult(MessageResult.fail);
			json.setMessage("校验失败，导入Excel文件的列数不能小于1!");
			return json;
		}
		List<List<String>> total_list = new ArrayList<List<String>>();
		List<String> row_list = null;
		// 每个数据的值
		String data = null;
		// 校验信息
		StringBuffer errMsg = new StringBuffer();
		for (int i = 0; i < row_size; i++) {
			row_list = new ArrayList<String>();
			for (int j = 0; j < sheet.getColumns(); j++) {
				cell = sheet.getCell(j, i);
				if (StringUtils.isBlank(cell.getContents())) {
					errMsg.append("第").append(i + 1).append("行，第").append(j + 1).append("列,");
					data = "";
				} else {
					data = cell.getContents().trim();
				}
				row_list.add(j, data);
			}
			total_list.add(row_list);
		}
		if(!StringUtils.isBlank(errMsg.toString())){
			json.setType(MessageType.warning);
			json.setResult(MessageResult.success);
			json.setMessage(errMsg.toString());
		}
		json.setItems(total_list);
		return json;
	}
}
