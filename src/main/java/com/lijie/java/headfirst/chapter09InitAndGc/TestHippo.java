package com.lijie.java.headfirst.chapter09InitAndGc;

/**
 * 构造函数先调用父类的构造函数。
 * **/
public class TestHippo {
	public static void main(String[] args) {
		Hippo h = new Hippo();
	}
}

class Animal{
	public Animal(String a){
		System.out.println("making a Animal !");
	}
}

class Hippo extends Animal{
	public Hippo(){
		/**
		 * 编译器会默认加上父类构造函数的调用
		 * 只会帮忙调用父类无参数版本构造函数
		 * **/
		super("1");
		System.out.println("making a Hippo !");
	}
}
