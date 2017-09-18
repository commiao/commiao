package com.commiao.basic.business.tools.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.chtwm.mall.core.util.LoggerFilterUtils;


public class Util {
	
	 private static final Logger logger = LoggerFactory.getLogger(Util.class);
	 /**日期格式：yyyy-MM-dd */
	 public static final String DATE_PATTERN_DAY = "yyyy-MM-dd";
	 /**时间格式：yyyy-MM-dd HH:mm:ss*/
	 public static final String DATE_PATTERN_TIME = "yyyy-MM-dd HH:mm:ss";
	 /**时间格式：HH:mm:ss*/
	 public static final String DATE_PATTERN_HOUR = "HH:mm:ss";
	 
	 public static void streamWrite(HttpServletResponse response, FileInputStream fis){
		 OutputStream os = null;
		 try {
			os = response.getOutputStream();
			byte[]  bb = new byte[512];
			int len = 0;
			while((len = fis.read(bb)) != -1){
				os.write(bb,0,len);
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} finally {
			if(os != null) {
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					logger.error("关闭输出流异常, " + e.getMessage(), e);
				}
			}
		}
	 }
	 
	 
	 public static int convertTypeString2Int(String intStr){
		 int rInt = -1;
		 if(null != intStr && !"".equals(intStr.trim()) && CheckUtil.isNumber(intStr)){
			 rInt = Integer.parseInt(intStr);
		 }
		 return rInt;
	 }
	 /**
	  * 首字母大写
	  * @param arg
	  * @return
	  */
	 public static String upperCaseFirstAlpha(String arg){
		 if(null != arg && arg.length() > 0){
			 arg = (arg.charAt(0) + "").toUpperCase() + arg.substring(1);
		 }
		 return arg;
	 }
	 
	 public static String profitPer100(String num){
		 String rs = num;
		 if(CheckUtil.isNumber(num)){
			 Double d = Double.parseDouble(num);
			 d = d * 100;
			 DecimalFormat df = new DecimalFormat("######0.##");
			 rs = df.format(d);
		 }
		 
		 return rs;
	 }
	 
	 
	 public static String profitPer100ByInt(String num){
		 String rs = num;
		 if(CheckUtil.isNumber(num)){
			 Double d = Double.parseDouble(num);
			 d = d * 100;
			 DecimalFormat df = new DecimalFormat("######0");
			 rs = df.format(d);
		 }
		 
		 return rs;
	 }
	 
	 public static String profitFormat(String num){
		 String rs = num;
		 if(CheckUtil.isNumber(num)){
			 Double d = Double.parseDouble(num);
			 DecimalFormat df = new DecimalFormat("######0.##");
			 rs = df.format(d);
		 }
		 
		 return rs;
	 }
	 public static String convertDateType(String date, String srcPattern, String dstPattern){
		 String tarDate = "";
		 if(null != date && !"".equals(date.trim())){
			 SimpleDateFormat srcSdf = new SimpleDateFormat(srcPattern);
			 SimpleDateFormat dstSdf = new SimpleDateFormat(dstPattern);
			 try {
				tarDate = dstSdf.format(srcSdf.parse(date));
			} catch (ParseException e) {
				logger.error(e.getMessage(), e);
				throw new RuntimeException(e);
			}
		 }
		 return tarDate;
	 }
	 public static String convertDateType(Date date, String pattern){
		 String tarDate = "";
		 if(null != date ){
			 SimpleDateFormat srcSdf = new SimpleDateFormat(pattern);
			 tarDate = srcSdf.format(date);
		 }
		 return tarDate;
	 }
	 
	 public static <T> T parseIdCertObject(String text, Class... clazz){
		 T t = null;
		try {
			t = (T) JSON.parseObject(text, clazz[0]);
//			String rs = getResults(clazz[0], t);
//			System.out.println("clazz.length:"+clazz.length);
//			if(!"".equals(rs)){
//				if(clazz.length < 2){
//					logger.error("没有传入result 类型 class");
//				}else{
//					Object obj = JSON.parseArray(rs, clazz[1]);
//					Method m = clazz[0].getDeclaredMethod("setResult", Object.class);
//					m.invoke(t, obj);
//				}
//				
//			}
			
		} catch (SecurityException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
		 
		 return t;
	 }
	 
	 
	 
	 private static String getResults(Class clazz,Object t){
		String rs = "";
		try {
			Field field = clazz.getDeclaredField("results");
			field.setAccessible(true);// 设置访问权限
			if (null != field) {
				String name = field.getName();
				if(null != field.get(t)){
					rs = field.get(t).toString();
				}
			}
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (NoSuchFieldException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
		 return rs;
		 
	 }
	 
	 
	 
	 public static <T> T parseListObject(String text, Class... clazz){
		 T t = null;
		try {
			t = (T) JSON.parseObject(text, clazz[0]);
			String rs = getList(clazz[0], t);
			if(!"".equals(rs)){
				if(clazz.length < 2){
					logger.error("没有传入result 类型 class");
				}else{
					Object obj = JSON.parseArray(rs, clazz[1]);
					Method m = clazz[0].getDeclaredMethod("setList", List.class);
					m.invoke(t, obj);
				}
				
			}
			
		} catch (NoSuchMethodException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
		 
		 return t;
	 }
	 private static String getList(Class clazz,Object t){
		 String rs = "";
		 try {
			 Field field = clazz.getDeclaredField("list");
			 field.setAccessible(true);// 设置访问权限
			 if (null != field) {
				 String name = field.getName();
				 if(null != field.get(t)){
					 rs = field.get(t).toString();
				 }
			 }
		 } catch (IllegalArgumentException e) {
			 logger.error(e.getMessage(), e);
			 throw new RuntimeException(e);
		 } catch (IllegalAccessException e) {
			 logger.error(e.getMessage(), e);
			 throw new RuntimeException(e);
		 } catch (NoSuchFieldException e) {
			 logger.error(e.getMessage(), e);
			 throw new RuntimeException(e);
		 } catch (SecurityException e) {
			 logger.error(e.getMessage(), e);
			 throw new RuntimeException(e);
		 }
		 return rs;
		 
	 }
	 
	 
	 
	 
	 
	/**
	 */
	 
	public static String sendPost(String url, Object ins) {
		Map<String,String> pm = new HashMap<String, String>();
		if(null != ins){
			Field [] fields0=ins.getClass().getDeclaredFields();
			Field [] fields2 = ins.getClass().getSuperclass().getDeclaredFields();
			Field [] fields= new Field[fields0.length + fields2.length];
			System.arraycopy(fields2, 0,fields,0,fields2.length);
			System.arraycopy(fields0, 0,fields,fields2.length,fields0.length);
			
			for(Field field:fields){
				field.setAccessible(true);//设置访问权限
				try {
					if(null != field.get(ins) && !"".equals(field.get(ins).toString())){
						//logger.debug(field.get(ins).toString());
						//logger.debug(field.getName());
						pm.put(field.getName(), field.get(ins).toString());
					}
				} catch (IllegalArgumentException e) {
					logger.error(e.getMessage(), e);
					throw new RuntimeException(e);
				} catch (IllegalAccessException e) {
					logger.error(e.getMessage(), e);
					throw new RuntimeException(e);
				}
				
			}
		}
		String param = "";
		for(String k : pm.keySet()){
			String v = pm.get(k);
			if("".equals(param)){
				param = k + "=" + v;
			}else{
				param = param + "&" + k + "=" + v;
			}
		}
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			out = new PrintWriter(new OutputStreamWriter(
					conn.getOutputStream(), "utf-8"));
			out.print(param);
			logger.info("[http请求工具]-请求URL:{}", LoggerFilterUtils.filterCharacters(url + "?" + param));
			out.flush();
			in = new BufferedReader(new InputStreamReader(
                   conn.getInputStream(), "utf-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			logger.error("http.post请求调用异常:", e);
		}
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				logger.error(ex.getMessage(), ex);
			}
		}
		logger.info("[http请求工具]-响应数据:{}", LoggerFilterUtils.filterCharacters(result));
		return result;
	}
	 /** 
    * 向指定URL发送GET方法的请求 
    *  
    * @param url 
    *            发送请求的URL 
    * @param param 
    *            请求参数，请求参数应该是name1=value1&name2=value2的形式。 
    * @return URL所代表远程资源的响应 
    */  
   public static String sendGet(String url, Object ins) {  
		Map<String,String> pm = new HashMap<String, String>();
		if(null != ins){
			Field [] fields0=ins.getClass().getDeclaredFields();
			Field [] fields2 = ins.getClass().getSuperclass().getDeclaredFields();
			Field [] fields= new Field[fields0.length + fields2.length];
			System.arraycopy(fields2, 0,fields,0,fields2.length);
			System.arraycopy(fields0, 0,fields,fields2.length,fields0.length);
			
			for(Field field:fields){
				field.setAccessible(true);//设置访问权限
				try {
					if(null != field.get(ins) && !"".equals(field.get(ins).toString())){
						//logger.debug(field.get(ins).toString());
						//logger.debug(field.getName());
						pm.put(field.getName(), field.get(ins).toString());
					}
				} catch (IllegalArgumentException e) {
					logger.error(e.getMessage(), e);
					throw new RuntimeException(e);
				} catch (IllegalAccessException e) {
					logger.error(e.getMessage(), e);
					throw new RuntimeException(e);
				}
				
			}
		}
		
		
		
		String param = "";
		for(String k : pm.keySet()){
			String v = pm.get(k);
			if("".equals(param)){
				param = k + "=" + v;
			}else{
				param = param + "&" + k + "=" + v;
			}
		}
       String result = "";  
       BufferedReader in = null;  
       try {  
           String urlName = url + "?" + param; 
           URL realUrl = new URL(urlName);  
           // 打开和URL之间的连接  
           URLConnection conn = realUrl.openConnection();  
           // 设置通用的请求属性  
           conn.setRequestProperty("accept", "*/*");  
           conn.setRequestProperty("connection", "Keep-Alive");  
           conn.setRequestProperty("user-agent",  
                   "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");  
           // 建立实际的连接  
           conn.connect();  
           // 获取所有响应头字段  
           Map<String, List<String>> map = conn.getHeaderFields();  
           // 遍历所有的响应头字段  
//           for (String key : map.keySet()) {  
//               System.out.println(key + "--->" + map.get(key));  
//           }  
           // 定义BufferedReader输入流来读取URL的响应  
           in = new BufferedReader(  
                   new InputStreamReader(conn.getInputStream()));  
           String line;  
           while ((line = in.readLine()) != null) {  
           	result += line;  
           }  
       } catch (Exception e) {  
           logger.error("http.get请求调用异常:", e);  
       }  
       // 使用finally块来关闭输入流  
       finally {  
           try {  
               if (in != null) {  
                   in.close();  
               }  
           } catch (IOException ex) {  
        	   logger.error(ex.getMessage(), ex);
           }  
       }  
       return result;  
   } 
	/**
	 * 六位数验证码
	 * @return
	 */
	public static String generateCheckCode(){
		return createRandom(true, 6);
	}
	
	/**
	 * 4位数字或者大写字母验证码,除"0","1"以外.
	 * generate certification code with 4 places number and alphabet.
	 * @return string
	 */
	public static String generateCertificationCode(){
		   String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",  
				   "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",  
				   "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V",  
				   "W", "X", "Y", "Z" };  
		List<String> list = Arrays.asList(beforeShuffle);  
		Collections.shuffle(list);  
		StringBuilder sb = new StringBuilder();  
		for (int i = 0; i < 4; i++) {  
			sb.append(list.get(i));  
		}
		return sb.toString();
	}
	/**
	 * 64位邮箱非重复随机码
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 */
	public static String generateMailCode(String mail) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//获取系统当前时间戳+随机long类型数
		String random_number =System.currentTimeMillis() + (long)(1+Math.random()*(77777-1+1)) + mail; 
		
		
//		MessageDigest md5=MessageDigest.getInstance("MD5");
        //加密后的字符串
//        String str1=new String(md5.digest(mail.getBytes("utf-8")),"UTF-8");
//        String str2=new String(md5.digest(random_number.getBytes("utf-8")),"UTF-8");
		return getBase64(random_number.trim());
	}
	  public static String getBase64(String str) {  
		  byte[] encodeBase64 = null;
	        try{  
	            encodeBase64 = Base64.encodeBase64(str.getBytes("UTF-8"));  
//	            System.out.println("RESULT: " + new String(encodeBase64));  
	        } catch(UnsupportedEncodingException e){  
	            logger.error(e.getMessage(), e);  
	        }  
	        return new String(encodeBase64);
	    }  
	
	
	/**
	 * 转为万单位(如果有小数保留两位)
	 * @param minba
	 * @return
	 */
	public static String convertWan(String minba) {
		String rs = minba;
		if(StringUtils.isNotBlank(minba) && CheckUtil.isNumber(minba)){
			double d = Double.parseDouble(minba);
			d = d/10000;
			BigDecimal   b   =   new   BigDecimal(d);  
			double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
            DecimalFormat df = new DecimalFormat("######0.00");
            rs = df.format(f1).replaceFirst("\\.00", "");
		}
		return rs;
	}
	/**
	 * 转为万单位
	 * @param minba
	 * @return
	 */
	public static String convertWanP(String minba) {
		String rs = minba;
		if(StringUtils.isNotBlank(minba) && CheckUtil.isNumber(minba)){
			double d = Double.parseDouble(minba);
			d = d*10000;
			BigDecimal   b   =   new   BigDecimal(d);  
			double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
			 DecimalFormat df = new DecimalFormat("######0");
			 rs = df.format(f1);
//			rs = f1 + "";
		}
		return rs;
	}
	/**
	 * 转为万单位且加千分位
	 * @param minba
	 * @return
	 * @throws ParseException 
	 */
	public static String convertWan2(String minba2) {
		String rs = minba2;
		if(StringUtils.isNotBlank(rs)){
			rs = rs.replaceAll(",", "");
			if(CheckUtil.isNumber(rs)){
				double d = Double.parseDouble(rs);
				d = new BigDecimal(d).divide(new BigDecimal(10000), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
				DecimalFormat df = new DecimalFormat("###,##0");
				rs = df.format(d);
			}
		}
		return rs;
	}
	
	/**
	 * 
	 * @Description:手机号码加*处理
	 * 如果是手机号码（11位），将4至7位变为*
	 * @author shl
	 * @param phoneNumber
	 * @return
	 */
	public static String maskPhone(String phoneNumber){
	    if(phoneNumber.length()==11){
	        phoneNumber=phoneNumber.substring(0,3)+"****"+phoneNumber.substring(7);
	    }
	    return phoneNumber;
	}

	public static void main(String[] args) throws Exception{
//		System.out.println(convertWan2("10,000,000"));
//		System.out.println(DateUtils.getDate("HH:mm:ss"));
//		System.out.println(getFormatDate("20161102"));
	    System.out.println(convertWan("1515000"));
	    System.out.println(convertWan("1500000"));
	    System.out.println(convertWan("1555555"));
	    System.out.println(convertWan("3000000"));
		double hh = 10001234/10000;
		System.out.println(hh);
		
		String str="19588080";
		System.out.println(replaceStr(str, "-"));
	}
	/**
	 * 
	 * 生成加减乘计算验证码
	 * @param digit 位数
	 * @return index 0 -- 计算公式；index 1 -- 计算结果
	 */
	public static String[] generateCalculateCertificationCode(int digit){
		int n1 = generateNumber(digit);
		int n2 = generateNumber(digit);
		int operCode = generateOperator();
		String[] returnInfo = new String[2];
		
		if(operCode == 2) {
			if(n1 >= n2) {
				returnInfo[0] = String.valueOf(n1) + " - " + String.valueOf(n2);
				returnInfo[1] = String.valueOf(n1 - n2);
			} else {
				returnInfo[0] = String.valueOf(n2) + " - " + String.valueOf(n1);
				returnInfo[1] = String.valueOf(n2 - n1);
			}
		} else if(operCode == 3) {
			returnInfo[0] = String.valueOf(n1) + " × " + String.valueOf(n2);
			returnInfo[1] = String.valueOf(n1 * n2);
		} else {
			returnInfo[0] = String.valueOf(n1) + " + " + String.valueOf(n2);
			returnInfo[1] = String.valueOf(n1 + n2);
		}
		
		
		return returnInfo;
	}
	
	/**
	 * 生成加减乘计算验证码的操作数
	 * @param digit 位数
	 * @return 返回操作数
	 */
	private static int generateNumber(int digit) {
		String[] beforeShuffle = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		List<String> l = Arrays.asList(beforeShuffle);
		Collections.shuffle(l);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < digit; i++) {
			sb.append(l.get(i));
		}
		
		return Integer.parseInt(sb.toString());
	}
	
	/**
	 * 生成加减乘计算验证码的操作符
	 * @return 返回操作符
	 */
	private static int generateOperator() {
		Integer[] beforeShuffle = new Integer[] {1, 2, 3};
		List<Integer> l = Arrays.asList(beforeShuffle);
		Collections.shuffle(l);
		return l.get(0).intValue();
	}
	/**
	 * 乘以10000
	 * @param appoint_money
	 * @return
	 */
	public static String multiW(String appoint_money) {
		if(CheckUtil.isNumber(appoint_money)){
			appoint_money = Double.parseDouble(appoint_money) * 10000 + "";
		}
		return appoint_money;
	}
	/**
	 * 除以100000
	 * @param appoint_money
	 * @return
	 */
	public static String exceptW(String appoint_money) {
		if(CheckUtil.isNumber(appoint_money)){
			appoint_money = profitFormat(Double.parseDouble(appoint_money) / 10000 + "");
		}
		return appoint_money;
	}
	
	
	public static String maskBankNo(String bankNo){
		StringBuffer sbBankNo = null;
		int length = bankNo.length();
		if(StringUtils.isNotEmpty(bankNo) && bankNo.length() > 15){
			sbBankNo = new StringBuffer();
			sbBankNo.append(bankNo.substring(0, 3));
			sbBankNo.append(length - 8);
			sbBankNo.append(bankNo.substring(length-3, length));
		}
		return sbBankNo!=null?sbBankNo.toString():"";
	}
	
	/**
	 * 
	 * @brief 创建指定数量的随机字符串 
	 *
	 * @author
	 *    - 2016年9月2日  申贺龙  创建初始版本
	 *
	 * @param numberFlag - 是否纯数字
	 * @param length - 生成位数
	 * @return
	 */
	public static String createRandom(boolean numberFlag, int length) {
		StringBuffer retSb = new StringBuffer();
		String strTable = numberFlag ? "1234567890"
				: "1234567890abcdefghijkmnpqrstuvwxyz";
		int len = strTable.length();
		boolean bDone = true;
		do {
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retSb.append(strTable.charAt(intR));
			}
			if (length < 1 || count == length) {
				bDone = false;
			}
		} while (bDone);

		return retSb.toString();
	}
	
	/**
	 * 
	 * @Description:日期比较
	 * @author shl
	 * @param compareDateStr - 比较对象 格式例如：2016-11-07
	 * @param beComparedDate - 被比较对象 格式例如：2016-11-07
	 * @param pattern 比较日期的格式 yyyy-MM-dd/yyyy-MM-dd HH:mm:ss/...
	 * @return
	 */
	public static int compareToDate(String compareDateStr, String beComparedDate, String pattern){
		SimpleDateFormat simpFormat = new SimpleDateFormat(pattern);
		int compareFlag = 0;
		try {
			Date compareDate = simpFormat.parse(compareDateStr);
			Date beCompared = simpFormat.parse(beComparedDate);
			compareFlag = compareDate.compareTo(beCompared);
		} catch (ParseException e) {
			logger.error("日期转换出现异常：", e);
		}
		return compareFlag;
	}
	
	/**
	 * 
	 * @Description:获取yyyy-MM-dd格式日期
	 * @author shl
	 * @param dateStr - yyyyMMdd格式
	 * @return
	 */
	public static String getFormatDate(String dateStr){
		String retStr = "";
		if(StringUtils.isNotEmpty(dateStr) && dateStr.length() == 8){
			retStr = dateStr.substring(0, 4) + "-" 
		+ dateStr.substring(4, 6) + "-"
		+ dateStr.substring(6, 8);
		}
		return retStr;
	}
	
	/**
	 * 字符串去除指定字符 
	 * @param str
	 * @return
	 */
	public static String replaceStr(String str,String index){
		return str.replace(index, "");
	}
	
	
}
