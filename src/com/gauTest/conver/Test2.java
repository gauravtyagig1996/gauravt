package com.gauTest.conver;

class TestSuper {

	void eat() {
		System.out.println("eating...");
	}

}

class cat extends TestSuper {

	void eat() {
		System.out.println("eating");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {

		super.eat();
		bark();
		eat();
	}
}

public class Test2 {

	public static void main(String args[]) {

		cat c = new cat();
		c.work();

	}
}