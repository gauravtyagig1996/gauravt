package com.gauTest.conver;

class Testp {

	void draw() {
		System.out.println("Drawing");
	}

}

class Rect extends Testp {

	void draw() {
		System.out.println("Draw a rectangle");
	}

}

class Circle extends Testp {

	void draw() {
		System.out.println("Draw a circle");
	}

}

class Triangle extends Testp {

	void draw() {
		System.out.println("Draw a triangle");
	}

}

class Square extends Testp {

	void draw() {
		System.out.println("Draw a square");
	}

}

public class Test10 {

	public static void main(String args[]) {

		Testp TT;

		TT = new Rect();
		TT.draw();

		TT = new Circle();
		TT.draw();

		TT = new Square();
		TT.draw();

		TT = new Triangle();
		TT.draw();
	}

}