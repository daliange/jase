package com.lijie.java.headfirst.chapter16Collection;

public class TandEtest {
	
	/**可以传入任何继承Object类的变量**/
	public static <T extends Object> void say(T a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		int i=100;
		TandEtest.say(i);
	}

}
