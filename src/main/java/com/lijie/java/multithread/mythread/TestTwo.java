package com.lijie.java.multithread.mythread;

public class TestTwo {
	
	public static void main(String[] args) {
		MythreadTwo mythreadTwo = new MythreadTwo();
		mythreadTwo.start();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
