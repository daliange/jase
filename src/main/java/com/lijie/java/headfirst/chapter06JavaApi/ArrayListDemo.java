package com.lijie.java.headfirst.chapter06JavaApi;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		//判断ArrayList是否为空
		System.out.println("判断ArrayList是否为空a.isEmpty()="+a.isEmpty());
		
		//ArrayList增加元素
		a.add("1");
		a.add("2");
		a.add("3");
		
		//ArrayList元素
		System.out.println("ArrayList元素="+a.toString());
		
		//判断ArrayList大小
		System.out.println("判断ArrayList大小a.size()="+a.size());
		
		//获取元素
		System.out.println("获取元素a.get(0)="+a.get(0));
		
		//返回索引
		System.out.println("返回索引a.indexOf('1')="+a.indexOf("1"));
		
		//判断是否包含
		System.out.println("判断是否包含a.contains('1')="+a.contains("1"));
		
		//移除元素
		String o1 = (String)a.remove(1);
		System.out.println("移除元素o1="+o1);
		System.out.println("剩余ArrayList="+a.toString());
		
		
		
	}

}
