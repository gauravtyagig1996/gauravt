package com.gau.exceptation;

public class ExceptationN3 {

	public static void main(String[] args) {

		try {

			int a = 30 / 0;

			System.out.println(a);
		}

		catch (Exception e) {
			System.out.println("the value can't divide by zero");
		e.printStackTrace();
		}

		System.out.println("rest code");
	}

}
