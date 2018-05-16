package com.lijie.java.jase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String args[]) throws IOException {
		char c;
		int i;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符, 按下 'q' 键退出。");
		// 读取字符
		do {
			i= (char) br.read();
			c= (char)i;
			System.out.println("i="+i+";c="+c);
		} while (c != 'q');
	}

}
