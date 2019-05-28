package com.lijie.java.jvm.chapter3;

public class chapter35 {
	
	private static final int _1MB = 1024*1024; 
	
	/**
	 * -Xmx3550m：设置JVM最大可用内存为3550M。
	 * -Xms3550m：设置JVM初始内存为3550m。此值可以设置与-Xmx相同，以避免每次垃圾回收完成后JVM重新分配内存。
	 * -Xmn2g：设置年轻代大小为2G。整个JVM内存大小=年轻代大小 + 年老代大小 + 持久代大小。
	 * -Xss128k： 设置每个线程的堆栈大小。JDK5.0以后每个线程堆栈大小为1M，以前每个线程堆栈大小为256K。
	 * 			更具应用的线程所需内存大小进行调整。在相同物理内 存下，减小这个值能生成更多的线程。
	 * 
	 * -XX:NewRatio=4:设置年轻代（包括Eden和两个Survivor区）与年老代的比值（除去持久代）。
	 * 					设置为4，则年轻代与年老代所占比值为1：4，年轻代占整个堆栈的1/5
	 * -XX:SurvivorRatio=4：设置年轻代中Eden区与Survivor区的大小比值。
	 * 					设置为4，则两个Survivor区与一个Eden区的比值为2:4，一个Survivor区占整个年轻代的1/6
	 * -XX:MaxPermSize=16m:设置持久代大小为16m。
	 * 
	 * 
	 * -XX:+UseParallelGC：选择垃圾收集器为并行收集器。此配置仅对年轻代有效。
	 * 						即上述配置下，年轻代使用并发收集，而年老代仍旧使用串行收集。
	 * -XX:ParallelGCThreads=20：配置并行收集器的线程数，即：同时多少个线程一起进行垃圾回收。
	 * 						此值最好配置与处理器数目相等。
	 * 
	 * -XX:+UseParallelOldGC：配置年老代垃圾收集方式为并行收集。JDK6.0支持对年老代并行收集。
	 * -XX:MaxGCPauseMillis=100:设置每次年轻代垃圾回收的最长时间，
	 * 						如果无法满足此时间，JVM会自动调整年轻代大小，以满足此值。
	 * 
	 * vm参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * **/
	
	public static void testAllocation(){
		System.out.println(_1MB);
		byte[] a1,a2,a3,a4;
		a1 = new byte[1*_1MB];
		a2 = new byte[1*_1MB];
		a3 = new byte[1*_1MB];
		System.gc();
		a4 = new byte[6*_1MB];//出现一次Monitor GC
		System.gc();
		
	}
	
	public static void main(String[] args) {
		testAllocation();
	}

}
