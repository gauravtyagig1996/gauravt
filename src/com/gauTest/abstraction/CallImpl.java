package com.gauTest.abstraction;

public class CallImpl extends CallAbstraction {

	@Override
	public String addNew(String name, String sName) {
		return name + " " + sName;
	}

	public static void main(String[] args) {
		CallImpl cm = new CallImpl();
		System.out.println(cm.addNew("Hello", "Java"));
		cm.addNew("Hello", "Java");
	}

}
