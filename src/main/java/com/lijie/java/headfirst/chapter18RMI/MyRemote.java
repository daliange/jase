package com.lijie.java.headfirst.chapter18RMI;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	
	/**声明远程调用异常**/
	/**参数或者返回值，必须是primitive主数据类型或者实现Serializable**/
	public String sayHello(String what) throws RemoteException;

}
