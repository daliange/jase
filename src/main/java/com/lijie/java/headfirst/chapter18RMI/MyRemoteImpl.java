package com.lijie.java.headfirst.chapter18RMI;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyRemoteImpl() throws RemoteException {
		super();
	}

	/**为什么不需要声明RemoteException？？？**/
	public String sayHello(String what)  throws RemoteException {
		System.out.println("reveice from client");
		return "Server says , "+what;
	}
	
	public static void main(String[] args) {
		try {
			//创建并导出接受指定port请求的本地主机上的Registry实例。  
            LocateRegistry.createRegistry(1099); 
            
            
			MyRemote myRemote = new MyRemoteImpl();
			
			//先创建注册表，然后才能在注册表中存储远程对象信息
			Naming.rebind("RemoteHello", myRemote);
			System.out.println("Server 启动成功。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
