package com.gau.exceptation;

public class Exceptation {
	public static void main(String[] args) {

		int a = 10;

		int b = 0;

		System.out.println(a);
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException c) {
			System.out.println(c);
		}

		System.out.println(b);
		System.out.println(a);

	}

}
