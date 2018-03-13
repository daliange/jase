package com.lijie.java.headfirst.chapter09InitAndGc;

import java.awt.Color;

/**
 * 使用this()来调用同一个类的另一个构造函数
 * this()只能在构造函数中使用，并且在第一行
 * super()与this()不能兼得
 * */
public class MiniInit extends Car{

	Color color;
	public MiniInit(){
		this(Color.red);
	}
	
	public MiniInit(Color c){
		super("Mini");
		color = c;
	}
	
	public MiniInit(int size){
		this(Color.red);
		//super(size);
	}
	public void out(){
		System.out.println("color="+color);
	}
	
	public static void main(String[] args) {
		MiniInit m = new MiniInit();
		m.out();
	
	}
}

class Car{
	public Car(String s){
		System.out.println(s);
	}
	
	public Car(int i){
		System.out.println(i);
	}
}
