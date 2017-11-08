package com.lijie.java.multithread.myrunnable;

public class Test {
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable,"MyRunnable----");
		thread.start();
		System.out.println("main="+Thread.currentThread().getName());
	}

}
