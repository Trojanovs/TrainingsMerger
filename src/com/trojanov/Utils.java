package com.trojanov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {
	public static Date getDateFromStrSLF(String dateTimeStr) {
		Date dateTime = null;
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'GMT'Z yyyy", Locale.US);
		try {
			dateTime = sdf.parse(dateTimeStr);
		} catch (ParseException e) {
			System.err.println("getDateFromStrSLF() strign parse to date error");
	
			e.printStackTrace();
		}
		return dateTime;		
	}
	
	public static Date getDateFromStrTCX(String dateTimeStr) {
		Date dateTime = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		try {
			dateTime = sdf.parse(dateTimeStr);
		} catch (ParseException e) {
			System.err.println("getDateFromStrTCX() strign parse to date error");
	
			e.printStackTrace();
		}
		return dateTime;		
	}
}
