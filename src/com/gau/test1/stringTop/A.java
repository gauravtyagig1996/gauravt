package com.gau.test1.stringTop;

public class A {
	public static void main(String[] args) {
		String name = "Java";// Store content pool;
		String topic = "Java";
		String n1 = new String("Java");// heap

		String aa = "Hello";
		System.out.println(aa.concat("Java"));
		aa.concat("Java");
		System.out.println(aa);
	}

}
