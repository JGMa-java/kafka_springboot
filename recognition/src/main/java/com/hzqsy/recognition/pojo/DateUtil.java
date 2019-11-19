package com.hzqsy.recognition.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DateUtil {
	
	private static SimpleDateFormat sdf;
	private static SimpleDateFormat sdfday;
	private static SimpleDateFormat datenumber;
	private static SimpleDateFormat datepart;
	private static SimpleDateFormat hourmitue;
	private static SimpleDateFormat datemonth;
	private static SimpleDateFormat dateyear;
	
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdfday = new SimpleDateFormat("yyyy-MM-dd");
		datenumber = new SimpleDateFormat("yyyyMMddHHmmss");
		datepart = new SimpleDateFormat("yyyyMMdd");
		datemonth = new SimpleDateFormat("yyyyMM");
		dateyear = new SimpleDateFormat("yyyy");
		hourmitue= new SimpleDateFormat("HH:mm:ss");
	}

	/**
	 * yyyy-MM-dd HH:mm:ss
	 * @param d
	 * @return
	 */
	public static String dateString(Date d) {
		return sdf.format(d);
	}
	
	public static Date systemDate() {
		return new Date();
	}
	
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 * @param
	 * @return
	 */
	public static String SystemDate() {
		return sdf.format(new Date());
	}
	
	public static Date mindate(Date d) {
		try {
			return   sdf.parse(sdfday.format(d)+" 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return  new Date();
	}
	
	public static Date maxdate(Date d) {
		try {
			return   sdf.parse(sdfday.format(d)+" 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return  new Date();
	}
	
	public static String mindatenumber(Date d) {
		try {
			return   datepart.format(d)+"000000";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  "";
	}
	
	public static String maxdatenumber(Date d) {
		try {
			return   datepart.format(d)+"235959";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  "";
	}
	
	/**
	 * yyyy-MM-dd
	 * @param d
	 * @return
	 */
	public static String datestr(Date d) {
		try {
			return   sdfday.format(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  "";
	}
	
	public static String datenumberString(Date d) {
		return datenumber.format(d);
	}
	
	public static String datepartString(Date d) {
		return datepart.format(d);
	}
	
	public static String dateString(Date d,int lev) {
		if(lev==6)return datepartString(d);
		if(lev==3)return datemonthString(d)+"*";
		if(lev==4)return dateyearString(d)+"*";
		return null;
	}
	
	public static String datemonthString(Date d) {
		return datemonth.format(d);
	}
	
	public static String dateyearString(Date d) {
		return dateyear.format(d);
	}
	
	
	public static Date datepart(String date) {
		try {
			return datepart.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
	public static Date datenumber(String date) {
		try {
			if(null!=date && date.length()==8){
				return datepart.parse(date);
			}
			return datenumber.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Date datenumber(Long date) {
		return datenumber(String.valueOf(date));
	}
	
	public static String hourString(Date d) {
		return hourmitue.format(d);
	}
	
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat formater = new SimpleDateFormat(format);
		return formater.format(date);
	}
	
	/**
	 * @方法说明:字符串转换成日期
	 * @输入参数:datestr 日期字符串
	 * @返回值:日期型
	 */
	public static Date convertStringToDate(String datestr) throws Exception{
		Date date = null;
		try {
			date = sdf.parse(datestr);
		} catch (ParseException e) {
			//e.printStackTrace();
			throw e;
		}
		return date;
	}

	/**
	 * @方法说明：字符串转换成日期
	 * @输入参数：datestr 日期字符串
	 * @输入参数：format 格式化字符串
	 * @返回值：日期型
	 */
	public static Date convertStringToDate(String datestr, String format)
			throws Exception {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date = df.parse(datestr);
		return date;
	}
	
	public static Date dateAddDay(Date date,int amount){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, amount);
		return calendar.getTime();
	}
	
	public static Date dateAddMinutes(Date date,int amount){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, amount);
		return calendar.getTime();
	}
	
	public static Date dateAddSeconds(Date date,int amount){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.SECOND, amount);
		return calendar.getTime();
	}
	
	//不精确的获取日期差
	public static int dateDiff(Date date1,Date date2){
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		return Integer.parseInt(String.valueOf(((time2-time1)/(1000*3600*24))));
	}
	
	//精确的获取日期跨度 但效率不高 适合较小时间范围
	public static int dateDiff2(Date date1,Date date2){
		date1.setHours(0);
		date1.setMinutes(0);
		date1.setSeconds(0);
		date2.setHours(0);
		date2.setMinutes(0);
		date2.setSeconds(0);
		return dateDiff(date1,date2);
	}
	
	public static Date passdate(String time) {
		try {
			return   sdfday.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  new Date();
	}
	
	
	
	
	
	public static final String getDatenumberSubstring(String datenumber){
		StringBuffer str=new StringBuffer();
		str.append(datenumber.substring(0, 4)).append("-").append(datenumber.substring(4, 6)).append("-").append(datenumber.substring(6, 8)).append(" ");
		str.append(datenumber.substring(8, 10)).append(":").append(datenumber.substring(10, 12)).append(":").append(datenumber.substring(12, 14));
	    return str.toString();
	}
	
	
	
	/**
	 * 获取两个日期之间的月份 （2017-01）
	 * */
	public static List<String> getMonthBetween(Date minDate, Date maxDate) {
	    ArrayList<String> result = new ArrayList<String>();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
	    
	    String mind = null;
	    String maxd = null;
		try {
			mind = dateString(minDate);
			maxd = dateString(maxDate);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	    
	    Calendar min = Calendar.getInstance();
	    Calendar max = Calendar.getInstance();

	    try {
			min.setTime(sdf.parse(mind));
			max.setTime(sdf.parse(maxd));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
	    max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

	    Calendar curr = min;
	    while (curr.before(max)) {
	     result.add(sdf.format(curr.getTime()));
	     curr.add(Calendar.MONTH, 1);
	    }

	    return result;
	  }
	
	
	public static String  getNowTimeStr(){
		return datenumber.format(new Date());
	}
	
	/**
	 * 获取当前系统时间,
	 * @return
	 * @throws Exception
	 */
	public static String getSysTimeStr() throws Exception {
		return datepartString(new Date());
	}
	
	/**
	 * 获取两个日期之间的所有日期（yyyy-MM-dd）
     * @param begin
     * @param end
     * 
	 * */
	public static List<Date> getBetweenDates(Date begin, Date end) {
        List<Date> result = new ArrayList<Date>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(begin);
        
	    while(begin.getTime() <= end.getTime()){
	        result.add(tempStart.getTime());
	        tempStart.add(Calendar.DAY_OF_YEAR, 1);
	        begin = tempStart.getTime();
	    }
        return result;
	}
	
	public static void main(String[] args) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		
		SimpleDateFormat formater = new SimpleDateFormat("yyyy");
		String year = formater.format(new Date());
		String datestr = year+"0719170000";
		System.out.println(datestr);
		Date date = df.parse(datestr);
		System.out.println(date);
	}
	
}
