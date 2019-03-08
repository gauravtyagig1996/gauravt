package com.gauTest.conver;

public class Test8 extends bike {

	void run() {
		System.out.println("bike is slow than car");
	}

	public static void main(String args[]) {

		bike w = new Test8();
		w.run();
	}

}

class bike {

	void run() {
		System.out.println("bike");
	}

}
