package com.shiva.patterns.singletom;

public class DateUtils {
	
	/*
	 * Eager Instance:- 
	 * 
	 * static{
	 *  instance = new DateUtils();
	 * }
	 * 
	 * we prefer Lazy instance.
	 */
	
	private static volatile DateUtils instance;
	
	private DateUtils() {} 
	
	public static DateUtils getInstance() {
		if(instance==null) {
		synchronized(DateUtils.class) {
		if(instance==null) {
			instance = new DateUtils();	
		}
		}
		}
		return instance;
	}
}
