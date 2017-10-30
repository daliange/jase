package com.lijie.java.jase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializable {
	
	/**
	 * class序列化，将java类转换为二进制字节
	 * 
	 * **/
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("daliange");
		student.setAge(30);
		
		File file = new File("/Users/lijie/Documents/develop/jase/student.txt");  
		
		try {
			//Student对象序列化过程  
		    FileOutputStream fos = new FileOutputStream(file);  
		    ObjectOutputStream oos = new ObjectOutputStream(fos);  
		    oos.writeObject(student);  
		    oos.flush();  
		    oos.close();  
		    fos.close();  
		    
		    
		    //Student对象反序列化过程  
		    FileInputStream fis = new FileInputStream(file);  
		    ObjectInputStream ois = new ObjectInputStream(fis);  
		    Student st1 = (Student) ois.readObject();  
		    System.out.println("name = " + st1.getName());  
		    System.out.println("age = " + st1.getAge());  
		    ois.close();  
		    fis.close();  
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}
	
	

}
