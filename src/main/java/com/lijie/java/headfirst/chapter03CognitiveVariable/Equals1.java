package com.lijie.java.headfirst.chapter03CognitiveVariable;

public class Equals1 {
	private void test1(A b) {
		b.age = 20;
		System.out.println("test1方法中的age=" + b.age);
	}

	public static void main(String[] args) {
		Equals1 t = new Equals1();
		A a = new A();
		a.age = 10;
		t.test1(a);
		System.out.println("main方法中的age=" + a.age);
	}
}

class A {
	public int age = 0;
}
