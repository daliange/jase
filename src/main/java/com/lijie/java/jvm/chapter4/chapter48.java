package com.lijie.java.jvm.chapter4;

import java.util.ArrayList;

public class chapter48 {
	
	private static byte[] b = new byte[1024*1024];
	
	public static void fillArrayList() throws InterruptedException{
		ArrayList<byte[]> list  = new ArrayList<byte[]>();
		for (int i=0 ; i<1000 ; i++){
			list.add(b);
			Thread.sleep(50);
		}
		System.gc();
		for (int i=0 ; i<1000 ; i++){
			list.add(b);
			Thread.sleep(50);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		fillArrayList();
	}

}



