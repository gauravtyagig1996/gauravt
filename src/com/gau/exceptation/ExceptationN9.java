package com.gau.exceptation;

public class ExceptationN9 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception hai");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception hai");
		}

	}
}
