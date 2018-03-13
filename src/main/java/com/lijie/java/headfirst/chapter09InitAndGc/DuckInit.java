package com.lijie.java.headfirst.chapter09InitAndGc;

public class DuckInit {
	
	public static void main(String[] args) {
		Duck d = new Duck();
		d.say();
	}

}

class Duck{
	
	/**
	 * 如果没有写构造函数，编译器会生成一个默认构造函数
	 * 如果已经写了构造函数，编译器不会再生成默认构造函数
	 * **/
	public Duck(){
		System.out.println("Duck的初始化方法！");
	}
	
	public void say(){
		System.out.println("Duck的叫嘎嘎！");
	}
}
