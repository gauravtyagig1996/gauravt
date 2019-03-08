package com.gauTest.conver;

class Cat {
}

public class Test12 extends Cat {
	static void method(Cat a) {
		//Test12 d = (Test12) a;
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Cat a = new Test12();
		Test12.method(a);
	}
}
