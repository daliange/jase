package com.lijie.java.headfirst.chapter18RMI;
import java.rmi.Naming;


public class MyRemoteClient {
	
	public static void main(String[] args) {
		try {
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s= service.sayHello("lijie");
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
