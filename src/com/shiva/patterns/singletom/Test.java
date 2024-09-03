package com.shiva.patterns.singletom;

public class Test {

	public static void main(String[] args) {
		DateUtils obj1= DateUtils.getInstance();
		DateUtils obj2= DateUtils.getInstance();	
		System.out.println(obj1==obj2);
	}

}
