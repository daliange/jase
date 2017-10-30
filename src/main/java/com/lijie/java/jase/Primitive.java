package com.lijie.java.jase;

/**
 * 基本类型!
 *
 */
public class Primitive 
{
    public static void main( String[] args )
    {
    	Boolean boo = true; 
    	
    	/**一个字节8个比特位，8bits**/
    	/**
    	 * 符号位都是用0表示“正”，用1表示“负”
    	 * 
    	 * 正整数的补码是其二进制表示，与原码相同
    	 * 127的补码，第一位符号位
    	 * 0111 1111
    	 * -127的补码
    	 * 0111 1111 取反 1000 0000 在+1 1000 0001
    	 * -128的补码
    	 * 1000 0000 取反 0111 1111 在+1 1000 0000
    	 * -1的补码
    	 * 0000 0001 取反 1111 1110 在+1 1111 1111
    	 * 
    	 * **/
    	byte minb = -128;
    	byte maxb = 127;
    	
    	short mins = -32768;
    	short maxs = 32767;
    	
    	/**
    	 * java 的基本数据类型，保存在栈里
    	 * byte 	8bits
    	 * short 	16bits
    	 * int 		32bits
    	 * long		64bits
    	 * 
    	 * float	32bits
    	 * double	64bits
    	 * 
    	 * char		16bits
    	 * boolean	8bits
    	 * **/
    	
    	/**
    	 * java引用类型，对象本身保存在堆上，引用保存在栈上
    	 * 
    	 * **/
    	
    	
    	/**
    	 * 变量的比较
    	 * == 用来比较基本类型
    	 * == 比较其他类型，指的是否引用
    	 * 
    	 * **/
    	
    	int a = 1;
    	int b = 1;
    	if(a==b){
    		System.out.println("int a==b,"+"true");
    	}
    	
    	
    	/**
    	 * c,d保存在栈上
    	 * "abc"保存在常量区，编译器优化后，存在一个常量不会新建
    	 * 
    	 * 
    	 * **/
    	String c = "abc";
    	String d = "abc";
    	if(c==d){
    		System.out.println("String c==d,"+"true");
    	}else{
    		System.out.println("String c==d,"+"false");
    	}
    	
    	//存放在虚拟机常量池
    	String g = "abc";
    	//存放在堆上
    	String h = new String("abc");
    	if(g==h){
    		System.out.println("String g==h,"+"true");
    	}else{
    		System.out.println("String g==h,"+"false");
    	}
    	
    	
    	
    	
    	Function e = new Function();
    	Function f = new Function();
    	if(e==f){
    		System.out.println("Class e==f,"+"true");
    	}else{
    		System.out.println("Class e==f,"+"false");
    	}
    	
    }
}
