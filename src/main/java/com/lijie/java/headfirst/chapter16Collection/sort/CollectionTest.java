package com.lijie.java.headfirst.chapter16Collection.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 比较集合
 * ArrayList
 * TreeSet 有序状态、防重
 * HashMap key/vlaue保存数据
 * LinkedList 经常插入或者删除中间元素的高效率集合，ArrayList比较实用
 * HashSet key/vlaue保存数据，防重
 * LinkedHashMap key/vlaue保存数据，有序
 * **/
public class CollectionTest {
	
	public static void main(String[] args) {
		
		/**Collections.sort(list)排序效率很高**/
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1000000;i>0;i--){
			list.add(i);
		}
		long begintime = System.currentTimeMillis();
		//System.out.println("排序前"+list);
		Collections.sort(list);
		long endtime = System.currentTimeMillis();
		//System.out.println("排序后"+list);
		System.out.println("耗时"+(endtime-begintime));
	}
	
	

}
