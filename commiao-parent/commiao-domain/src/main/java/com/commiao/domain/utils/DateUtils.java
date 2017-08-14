package com.commiao.domain.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.sun.jmx.snmp.Timestamp;

/**
 * 日期转换工具
 */
public class DateUtils {
	public static final String C_DATE_DIVISION = "-";
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String C_TIME_PATTON_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	/**
	 * yyyy-MM-dd
	 */
	public static final String C_DATE_PATTON_DEFAULT = "yyyy-MM-dd";
	/**
	 * YYYYMMddHHmmssSSS
	 */
	public static final String C_TIME_PATTON_ALL = "yyyyMMddHHmmssSSS";
	/**
	 * yyyyMMdd
	 */
	public static final String C_DATA_PATTON_YYYYMMDD = "yyyyMMdd";
	/**
	 * HH:mm:ss
	 */
	public static final String C_TIME_PATTON_HHMMSS = "HH:mm:ss";

	public static final int C_ONE_SECOND = 1000;
	public static final int C_ONE_MINUTE = 60 * C_ONE_SECOND;
	public static final int C_ONE_HOUR = 60 * C_ONE_MINUTE;
	public static final int C_ONE_DAY = 24 * C_ONE_HOUR;
	
	/**
	 * 现在和指定的日期比较
	 * <br>-1 早于当前时间
	 * <br>0  相等
	 * <br>1  晚于当前时间
	 * @param date
	 * @return
	 */
	public static int compareToday(Date date){
		return compareDate(date, new Date());
	}

	/**
	 * 比较日期
	 * <br>-1 date1早于date2
	 * <br>0  date1=date2
	 * <br>1  date1晚于date2
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compareDate(Date date1,Date date2){
        if (date1.getTime() > date2.getTime()) {//date1 晚于 date2
            return 1;
        } else if (date1.getTime() < date2.getTime()) {//date1 早于 date2
            return -1;
        } else {//相等
            return 0;
        }
	}
	
	/**
	 * 获取当前系统时间 日期类型
	 * @return － DATE<br>
	 */
	public static Date getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();

		return currDate;
	}

	/**
	 * 获取当前系统时间 字符串类型 （yyyy-MM-dd）
	 * @return － 产生的日期字符串<br>
	 */
	public static String getCurrentDateStr() {
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();

		return formatDate(currDate);
	}
	
	/**
	 * 获取当前系统时间 字符串类型 （yyyyMMddHHmmssSSS）
	 * @return － 产生的日期字符串<br>
	 */
	public static String getCurrentTimeStr(){
		return format(new Date(), C_TIME_PATTON_ALL);
	}

	/**
	 * 获取当前系统时间
	 * @param strFormat 指定的格式
	 * @return
	 */
	public static String getCurrentDateStr(String strFormat) {
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();

		return format(currDate, strFormat);
	}

	/**
	 * 将字符串类型转换为日期类型
	 * @param dateValue yyyy-MM-dd
	 * @return
	 * @throws Exception
	 */
	public static Date parseDate(String dateValue) {
		return parseDate(C_DATE_PATTON_DEFAULT, dateValue);
	}

	/**
	 * 将字符串类型转换为日期类型
	 * @param dateValue yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static Date parseDateTime(String dateValue) {
		return parseDate(C_TIME_PATTON_DEFAULT, dateValue);
	}

	/**
	 * 将字符串类型转换为日期类型
	 * @param strFormat 指定格式（可以为空，默认yyyy-MM-dd HH:mm:ss）
	 * @param dateValue 指定字符串
	 * @return
	 * @throws ParseException
	 * @throws Exception
	 */
	public static Date parseDate(String strFormat, String dateValue) {
		if (dateValue == null)
			return null;

		if (strFormat == null)
			strFormat = C_TIME_PATTON_DEFAULT;

		SimpleDateFormat dateFormat = new SimpleDateFormat(strFormat);
		Date newDate = null;

		try {
			newDate = dateFormat.parse(dateValue);
		} catch (Exception pe) {
			newDate = null;
		}

		return newDate;
	}

	/**
	 * 将Timestamp类型的日期转换为系统参数定义的格式的字符串。yyyy-MM-dd
	 * 
	 * @param aTs_Datetime 需要转换的日期。
	 * @return 转换后符合给定格式的日期字符串
	 */
	public static String formatDate(Date aTs_Datetime) {
		return format(aTs_Datetime, C_DATE_PATTON_DEFAULT);
	}

	/**
	 * 将Timestamp类型的日期转换为系统参数定义的格式的字符串。yyyy-MM-dd HH:mm:ss
	 * 
	 * @param aTs_Datetime 需要转换的日期。
	 * @return 转换后符合给定格式的日期字符串
	 */
	public static String formatTime(Date aTs_Datetime) {
		return format(aTs_Datetime, C_TIME_PATTON_DEFAULT);
	}

	/**
	 * 将Date类型的日期转换为系统参数定义的格式的字符串。
	 * 
	 * @param aTs_Datetime
	 * @param as_Pattern
	 * @return
	 */
	public static String format(Date aTs_Datetime, String as_Pattern) {
		if (aTs_Datetime == null || as_Pattern == null)
			return null;

		SimpleDateFormat dateFromat = new SimpleDateFormat();
		dateFromat.applyPattern(as_Pattern);

		return dateFromat.format(aTs_Datetime);
	}

	/**
	 * @param aTs_Datetime
	 * @param as_Format
	 * @return
	 */
	public static String formatTime(Date aTs_Datetime, String as_Format) {
		if (aTs_Datetime == null || as_Format == null)
			return null;

		SimpleDateFormat dateFromat = new SimpleDateFormat();
		dateFromat.applyPattern(as_Format);

		return dateFromat.format(aTs_Datetime);
	}

	public static String getFormatTime(Date dateTime) {
		return formatTime(dateTime, C_TIME_PATTON_HHMMSS);
	}

	/**
	 * @param aTs_Datetime
	 * @param as_Pattern
	 * @return
	 */
	public static String format(Timestamp aTs_Datetime, String as_Pattern) {
		if (aTs_Datetime == null || as_Pattern == null)
			return null;

		SimpleDateFormat dateFromat = new SimpleDateFormat();
		dateFromat.applyPattern(as_Pattern);

		return dateFromat.format(aTs_Datetime);
	}

	/**
	 * 取得指定日期N天后的日期
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		cal.add(Calendar.DAY_OF_MONTH, days);

		return cal.getTime();
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int daysInterval(Date date1, Date date2) {
		return timeInterval( date1, date2, C_ONE_DAY );
	}
	
	/**
	 * 计算两个日期之间相差的小时数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int hoursInterval(Date date1, Date date2) {
		return timeInterval( date1, date2, C_ONE_HOUR );
	}
	
	/**
	 * 计算两个日期之间相差的分钟数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int minutesInterval(Date date1, Date date2) {
		return timeInterval( date1, date2, C_ONE_MINUTE );
	}
	
	/**
	 * 计算两个日期之间相差的分钟数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int secondsInterval(Date date1, Date date2) {
		return timeInterval( date1, date2, C_ONE_SECOND );
	}
	
	/**
	 * 计算两个date的时间间隔
	 * @param date1
	 * @param date2
	 * @param c_one_type
	 * <br>C_ONE_SECOND = 1000;
	 * <br>C_ONE_MINUTE = 60 * C_ONE_SECOND;
	 * <br>C_ONE_HOUR = 60 * C_ONE_MINUTE;
	 * <br>C_ONE_DAY = 24 * C_ONE_HOUR;
	 * @return
	 */
	public static int timeInterval(Date date1, Date date2, int c_one_type){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		long time1 = cal.getTimeInMillis();
		cal.setTime(date2);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / c_one_type;

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 计算当前日期相对于"1977-12-01"的天数
	 * 
	 * @param date
	 * @return
	 */
	public static long getRelativeDays(Date date) {
		Date relativeDate = DateUtils.parseDate("yyyy-MM-dd", "1977-12-01");

		return DateUtils.daysInterval(relativeDate, date);
	}

	public static Date getDateBeforTwelveMonth() {
		String date = "";
		Calendar cla = Calendar.getInstance();
		cla.setTime(getCurrentDate());
		int year = cla.get(Calendar.YEAR) - 1;
		int month = cla.get(Calendar.MONTH) + 1;
		if (month > 9) {
			date = String.valueOf(year) + C_DATE_DIVISION + String.valueOf(month) + C_DATE_DIVISION + "01";
		} else {
			date = String.valueOf(year) + C_DATE_DIVISION + "0" + String.valueOf(month) + C_DATE_DIVISION + "01";
		}

		Date dateBefore = parseDate(date);
		return dateBefore;
	}

	/**
	 * 传入时间字符串,加一天后返回Date
	 * 
	 * @param date
	 *            时间 格式 YYYY-MM-DD
	 * @return
	 */
	public static Date addDate(String date) {
		if (date == null) {
			return null;
		}

		Date tempDate = parseDate(C_DATE_PATTON_DEFAULT, date);
		String year = format(tempDate, "yyyy");
		String month = format(tempDate, "MM");
		String day = format(tempDate, "dd");

		GregorianCalendar calendar = new GregorianCalendar(
				Integer.parseInt(year), Integer.parseInt(month) - 1,
				Integer.parseInt(day));

		calendar.add(GregorianCalendar.DATE, 1);
		return calendar.getTime();
	}

	/**
	 * 返回某个按月还款的Loan在第n期的还款时间。时间计算的起点是放标时间，即Loan.releaseTime <br>
	 * <br>
	 * 某标在6月3日投满，并经确认放款给借款者（都在6月3日
	 * 23：59之前完成）。则此标第一个还款日应是7月2日。在7月2日晚23：59分或之前还款，都算是正常
	 * 。（一个更典型的例子：6月1日放款的标，第一个还款日应是6月30日，而不是7月1日。） <br>
	 * <br>
	 * 如果在7月3日0：00之后还款，则视为逾期，如果还款人在7月4日凌晨1：00还款，逾期了25个小时，则视为逾期2天。
	 * 
	 * @param releaseTime :放标时间
	 * @param phaseNumber
	 *            期数，从1开始
	 * @return 在第n期的还款时间
	 */
	public static Date getMonthlyRepayDate(Date releaseTime, int phaseNumber) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(releaseTime);

		calendar.add(Calendar.DAY_OF_MONTH, 1);

		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.SECOND, -1);
		calendar.add(Calendar.MONTH, phaseNumber);
		return calendar.getTime();
	}
	
	/**
	 * 按“天”借款的方式 返款时间的计算
	 * 
	 * @param releaseTime
	 *            放款时间
	 * @param termCount
	 *            借款天数
	 * @return 还款日期
	 */
	public static Date getDayRepayDate(Date releaseTime, int termCount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(releaseTime);
		calendar.add(Calendar.DAY_OF_MONTH, termCount);
		return calendar.getTime();
	}
	
	public static void main(String[] args) {
		// Date date1 = DateUtil.addDays(DateUtil.getCurrentDate(),1);
		// Date date2 = DateUtil.addDays(DateUtil.getCurrentDate(),101);
		//
		// System.out.println(DateUtil.getRelativeDays(date1));
		// System.out.println(DateUtil.getRelativeDays(date2));

		// Timestamp date = new Timestamp(801);
		//
		// System.out.println(date);
		// String strDate = DateUtil.format(date, C_DATA_PATTON_YYYYMMDD);
		//
		// System.out.println(strDate);
//		Date date = new Date();
//		DateUtils.formatTime(date, C_DATA_PATTON_YYYYMMDD);
//		System.out.println(date);
//		String date1 = "2006-07-31";
//		System.out.println(date1);
		// Date date2 = addDate(date);
		// System.out.println(date2);
		String s1 = "2016-01-30 15:00:00";
		Date date1 = parseDateTime(s1);
//		System.out.println(minutesInterval(date1, new Date()));
		System.out.println(compareDate(date1,new Date()));
		Date date2 = parseDateTime(s1);
		System.out.println(formatTime(getMonthlyRepayDate(date2, 2)));
	}
}