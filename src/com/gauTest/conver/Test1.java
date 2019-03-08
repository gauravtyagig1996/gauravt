package com.gauTest.conver;

class TestSuper1 {

	String color = "white";

}

class dog extends TestSuper1 {

	String color = "black";

	void printColor() {

		System.out.println(color);
		System.out.println(super.color);

	}
}

public class Test1 {

	public static void main(String args[]) {

		dog d = new dog();
		d.printColor();
	}
}