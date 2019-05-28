package com.lijie.java.jvm.chapter3;

public class chapter37 {
	
	/**
	 * 
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * -XX:+UseSerialGC
	 * 长期存活的对象进入老年代
	 * -XX:MaxTenuringThreshold=1
	 * -XX:+PrintTenuringDistribution
	 * **/
	private static final int _1MB = 1024*1024; 
	
	public static void testAllocation(){
		byte[] a1,a2,a3;
		a1 = new byte[1*_1MB/4];
		a2 = new byte[4*_1MB];
		a3 = new byte[4*_1MB];
		a3 = null;
		a3 = new byte[4*_1MB];
		
	}
	
	public static void main(String[] args) {
		testAllocation();
	}
	

}
