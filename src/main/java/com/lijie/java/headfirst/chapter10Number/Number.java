package com.lijie.java.headfirst.chapter10Number;

/**
 * static 以类的名称调用静态方法Math.max(1, 2)
 * 以引用变量的名称调用非静态方法
 * Song s = new Song();
 * s.play();
 * 
 * 静态变量的值，对所有实例来说都相同
 * 
 * **/
public class Number {
	
	public static void main(String[] args) {
		System.out.println(Math.max(1, 2));
	}

}
