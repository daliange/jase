package com.lijie.java.jase;

public class Test {
	
	public static void main(String[] args) {
		long a= System.currentTimeMillis();
		System.out.println(a);
		Thread thread = new Thread();
		try {
			thread.sleep(100);
			long b = System.currentTimeMillis();
			System.out.println(b);
			System.out.println(b-a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
