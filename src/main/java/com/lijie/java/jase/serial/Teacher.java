package com.lijie.java.jase.serial;

import java.io.Serializable;

public class Teacher implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
