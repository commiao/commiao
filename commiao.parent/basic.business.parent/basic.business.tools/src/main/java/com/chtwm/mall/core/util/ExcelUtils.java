package com.chtwm.mall.core.util;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	//小数位数保留——默认方式
	public final static int NON_ROUNDING = -1;
	//小数位数保留——2位
	public final static int TOW_ROUNDING = 2;
	
	//poi中对excel单元格类型的定义——百分号
	private final static short DATA_FORMAT_ID_PERCENT = 10;
	
	//产品编码位数
	private final static int FUND_CODE_LENGTH = 6;

	/**
	 * 获取字符串值，返回字符串
	 * @param cell
	 * @return
	 */
	public static String getStringValue(Cell cell){
		if(cell == null) {
			return null;
		}
		if(cell.getCellType() == Cell.CELL_TYPE_BLANK){
			return "";
		}
		if(cell.getCellType() == Cell.CELL_TYPE_STRING){
			return getStringVal(cell);
		}
		
		return null;
	}
	
	/**
	 * 获取数值型值，返回字符串，不截取小数
	 * @param cell
	 * @return
	 */
	public static String getDoubleValue(Cell cell){
		return getDoubleValue(cell, NON_ROUNDING);
	}
	
	/**
	 * 获取数值型值，返回字符串，保留digit位小数
	 * @param cell
	 * @param digit
	 * @return
	 */
	public static String getDoubleValue(Cell cell, int digit) {
		if(cell == null) {
			return null;
		}
		if(cell.getCellType() == Cell.CELL_TYPE_BLANK) {
			return "";
		}
		if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			String returnNumber = String.valueOf(getDoubleVal(cell, digit));
			if(cell.getCellStyle().getDataFormat() == DATA_FORMAT_ID_PERCENT) {
				return returnNumber + "%";
			}
			return returnNumber;
		}
		return null;
	}
	
	/**
	 * 获取布尔值，返回字符串
	 * @param cell
	 * @return
	 */
	public static String getBooleanValue(Cell cell) {
		if(cell == null) {
			return null;
		}
		if(cell.getCellType() == Cell.CELL_TYPE_BLANK) {
			return "";
		}
		
		if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(getBooleanVal(cell));
		}
		return null;
	}
	
	/**
	 * 根据单元格数据类型，获取值，返回字符串。数值型不截取小数
	 * @param cell
	 * @return
	 */
	public static String getValue(Cell cell) {
		return getValue(cell, NON_ROUNDING);
	}
	
	/**
	 * 根据单元格数据类型，获取值，返回字符串，保留digit位小数
	 * @param cell
	 * @param digit
	 * @return
	 */
	public static String getValue(Cell cell, int digit) {
		if(cell == null) {
			return null;
		}
		if(cell.getCellType() == Cell.CELL_TYPE_BLANK) {
			return "";
		}
		
		if(cell.getCellType() == Cell.CELL_TYPE_STRING) {
			return getStringVal(cell);
		}
		
		if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			double returnNumber = getDoubleVal(cell, digit);
			if(cell.getCellStyle().getDataFormat() == DATA_FORMAT_ID_PERCENT) {
				if(returnNumber == 0) {
					return "0.00 ";
				} else {
					return (new BigDecimal(returnNumber * 100)).setScale(TOW_ROUNDING, RoundingMode.HALF_UP).toString() + "%";
				}
			}
			return String.valueOf(returnNumber);
		}
		
		if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(getBooleanVal(cell));
		}
		
		return null;
	}
	
	public static String getFundCode(String code) {
		String returnCode = code;
		if(StringUtils.isNotBlank(code)) {
			//产品代码，截取“.”之前的部分
			if(StringUtils.indexOf(code, ".") >= 0) {
				returnCode = StringUtils.substring(code, 0, StringUtils.indexOf(code, "."));
			}
		} else {
			returnCode = "";
		}
		
		return returnCode;
	}
	
	public static String getPublicFundCode(String code) {
//		String returnCode = getFundCode(code);
		if(StringUtils.isNotBlank(code)) {
			//产品代码，不足6位的前面补0
			int zeroCnt = FUND_CODE_LENGTH - StringUtils.length(code);
			for(int i = 0; i < zeroCnt; i++) {
				code = "0" + code;
			}
		}
		return code;
	}
	
	public static String getStringVal(Cell cell) {
		return cell.getStringCellValue();
	}
	

    /**
     * 单元格取值.
     * @param i
     * @param cell
     * @return
     */
	public static String getCellValue(int i, Cell cell){
        String cellStr = "";
        if(i >= 4 && i < 7){// 用户账户 用户姓名    被推荐人姓名  被推荐人电话  省份
            if(cell != null && StringUtils.isNotBlank(cell.getStringCellValue())){
                cellStr = cell.getStringCellValue();
            }
        }
        
        return cellStr;
    }
    
	private static double getDoubleVal(Cell cell, int digit) {
		double cellValue = cell.getNumericCellValue();
		if(digit == NON_ROUNDING) {
			return cellValue;
		}
		
		//四舍五入
		return BigDecimal.valueOf(cellValue).setScale(digit, RoundingMode.HALF_UP).doubleValue();
	}
	
	private static boolean getBooleanVal(Cell cell) {
		return cell.getBooleanCellValue();
	}
	public synchronized static Workbook getWorkbook(InputStream fin) throws Exception{
		Workbook book = null;
		try {
			book = new XSSFWorkbook(fin);
		} catch (Exception ex) {
			book = new HSSFWorkbook(fin);
		}
		return book;
	}
}