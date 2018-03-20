package org.world.utils;

import java.util.Calendar;

public class Utils {
	public static String giveId(String s){  
		String result="";
		Calendar c=Calendar.getInstance();
		int year = c.get(Calendar.YEAR)/100;  
		int month = c.get(Calendar.MONTH)+1;   
		int date = c.get(Calendar.DATE); 
		
		String str1=s.substring(0,4);
		String day="";
		if(month<10) {
			day=day+year+"0"+month;
		}
		if(date<10){
			day=day+"0"+date;
		}else {
			day=day+date;
		}
		if(s.length()>5) {
			String id=s.substring(10);
			System.out.println(id);
			int d=Integer.valueOf(id)+1;
			String e=null;
			if(d<10) {
				e="0"+d;
				result=str1+day+e;
			}else {
				result=str1+day+d;
			}
		}else{
			result=str1+day+"00";
		}
		return result;
	}
	public static String getDate() {
		Calendar c=Calendar.getInstance();
		int year = c.get(Calendar.YEAR);  
		int month = c.get(Calendar.MONTH)+1;   
		int day = c.get(Calendar.DATE); 
		 String s=year+""+month+""+day;
		 String m=null;
		 String d=null;
		 if(month<10) {
			  m=0+""+month;
		 }else {
			  m=""+month;
		 }
		 if(day<10) {
			 d=0+""+day;
		 }else {
			 d=""+day;
		 }
		 String date=year+m+d;
		 return date;
	 }










}
