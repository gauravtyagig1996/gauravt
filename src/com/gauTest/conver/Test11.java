package com.gauTest.conver;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

public class Test11 extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Animal a = new Test11();
		a.eat();
	}

}
