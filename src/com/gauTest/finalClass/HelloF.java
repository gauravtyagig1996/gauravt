package com.gauTest.finalClass;

public class HelloF {

	static final String name = "SMG";
	int age = 45;
    /*Name: Gaurav Tyagi
	Date: XYZ
	Use: Addisation value
	Duscreption: 
	*/
	final public String hello(final String name) {
		// name="bBB";
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) {
		new HelloF().hello("hello");
	}

}
