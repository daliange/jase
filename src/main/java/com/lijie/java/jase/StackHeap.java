package com.lijie.java.jase;

public class StackHeap {
	
	/**
	 * Stack栈，保存方法、局部变量、引用变量
	 * heap堆，保存所有的对象
	 * 
	 * **/
	
	public static void main(String[] args) {
		try {
			int i=1;
			char a = 'a';
			String b = "b";
			Thread.currentThread().sleep(100000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
