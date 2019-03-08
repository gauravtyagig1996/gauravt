package com.gauTest.abstraction;

public abstract class CallAbstraction {

	public String add(String fName, String lName) {
		return fName + " " + lName;
	}

	public abstract String addNew(String name, String sName);

}
