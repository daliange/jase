package com.lijie.java.headfirst.chapter16Collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SongSortTest {
	
	public static void main(String[] args) {
		
		/**
		 * public native int hashCode();
		 * 需要理解hashCode
		 * **/
		System.out.println(new Song("a","lijie"));
		
		/**
		 * 对Song的list进行排序
		 * **/
		ArrayList<Song> list = new ArrayList<Song>();
		list.add(new Song("z","b"));
		list.add(new Song("y","a"));
		list.add(new Song("x","c"));
		
		/**按照Song实现的compare方法排序**/
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
		
		/**按照ArtistCompare实现的compare方法排序**/
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(list, artistCompare);
		System.out.println("排序后："+list);
		
		
	}

}
