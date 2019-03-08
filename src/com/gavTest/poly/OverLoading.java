package com.gavTest.poly;

public class OverLoading {

	public String add(String a, String b) {
		return a + " " + b;
	}
	public String add(String a, String b,String c) {
		return a + " " + b+ " "+c;
	}
	public String add(String a, int b) {
		return a + " " + b;
	}
	
}
