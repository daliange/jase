package com.lijie.java.headfirst.chapter16Collection.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class HashSetTest {
	
	public static void main(String[] args) {
		
		ArrayList<Song> list = new ArrayList<Song>();
		list.add(new Song("z","b"));
		list.add(new Song("y","a"));
		list.add(new Song("b","a"));
		list.add(new Song("x","c"));
		list.add(new Song("x","c"));
		
		System.out.println(list);
		
		HashSet<Song> hashSet = new HashSet<Song>();
		hashSet.addAll(list);
		System.out.println(hashSet);
		
		TreeSet<Song> treeSet = new TreeSet<Song>();
		treeSet.addAll(list);
		System.out.println(treeSet);
		
		
		
	}

}
