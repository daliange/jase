package com.lijie.java.headfirst.chapter03CognitiveVariable;

/***
 * （1）：“在Java里面参数传递都是按值传递”这句话的意思是：
 * 按值传递是传递的值的拷贝，按引用传递其实传递的是引用的地址值，所以统称按值传递。
 *
 *（2）：在Java里面只有基本类型和按照下面这种定义方式的String是按值传递，其它的都是按引用传递。
 * 就是直接使用双引号定义字符串方式：String str = “Java私塾”;
 * */
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
