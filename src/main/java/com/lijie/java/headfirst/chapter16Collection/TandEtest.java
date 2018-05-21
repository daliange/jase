package com.lijie.java.headfirst.chapter16Collection;

public class TandEtest {
	
	/**可以传入任何继承Object类的变量**/
	public static <T extends Object> void sayOne(T a){
		System.out.println(a);
	}
	
	/**
	 * 这样写问什么不可以？
	 **/
//	public static void sayTwo (<? extends Object> a){
//		System.out.println(a);
//	}
	
	public static void main(String[] args) {
		int i=100;
		TandEtest.sayOne(i);
	}

}
