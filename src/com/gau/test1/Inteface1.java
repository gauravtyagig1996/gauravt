package com.gau.test1;

public class Inteface1 {

	public static void main(String args[]) {

		shape s;

		s = new Rectangle();
		s.draw();

		s = new Circle();
		s.draw();

		s = new Square();
		s.draw();
	}

}

interface shape {
	void draw();

}

class Rectangle implements shape {

	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle implements shape {

	public void draw() {
		System.out.println("Drawing circle");
	}

}

class Square implements shape {

	public void draw() {
		System.out.println("Drawing Square");
	}

}