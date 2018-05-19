package com.lijie.java.jase.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		/** 使用缓冲区 **/
		File file = new File("/Users/lijie/Documents/develop/jase/fileread.txt");
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/** 不使用缓冲区 **/
		try {
			fileReader = new FileReader(file);
			char[] a = new char[50];
			fileReader.read(a); // 读取数组中的内容
			System.out.println("fileReader读取内容到数组");
			for (char c : a)
				System.out.print(c); // 一个一个打印字符
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/** 不使用缓冲区 **/
		try {
			fileReader = new FileReader(file);
			System.out.println("fileReader读取内容到字符");
			int i;
			while ((i=fileReader.read())!=-1){
				System.out.println((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
