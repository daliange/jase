package com.lijie.java.headfirst.chapter03CognitiveVariable;

public class Equals2 {
	private void test1(A b) {
		b = new A();// 新加的一行
		b.age = 20;
		System.out.println("test1方法中的age=" + b.age);
	}

	public static void main(String[] args) {
		Equals2 t = new Equals2();
		A a = new A();
		a.age = 10;
		t.test1(a);
		System.out.println("main方法中的age=" + a.age);
	}
}
