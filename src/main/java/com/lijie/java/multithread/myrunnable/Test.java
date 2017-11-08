package com.lijie.java.multithread.myrunnable;

public class Test {
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		System.out.println("运行结束！");
	}

}
