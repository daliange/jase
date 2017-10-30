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
    	 * java 的基本数据类型
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
    	
    	
    }
}
