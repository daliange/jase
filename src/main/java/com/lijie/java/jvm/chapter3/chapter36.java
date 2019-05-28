package com.lijie.java.jvm.chapter3;

public class chapter36 {
	
	/**
	 * 大对象直接分配进老年代，避免在新生代的Eden 与幸存区 大量内存复制
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * 超过下面的值，直接进入老年代(只对SerialGC，ParallelGC有效)
	 * -XX:+UseSerialGC
	 * -XX:PretenureSizeThreshold=1048576
	 * **/
	
	private static final int _1MB = 1024*1024; 
	
	public static void testAllocation(){
		//System.out.println(_1MB);
		byte[] a1;
		a1 = new byte[1*_1MB];
		
	}
	
	public static void main(String[] args) {
		testAllocation();
	}
	
	

}
