package com.gau.test1.stringTop;

public class Comp {
	public static void main(String[] args) {
		String a = "Hello";// 0101010111100
		String b = "Hello";// 1111000010101
		String ds = new String("Hello");
		
		System.out.println(a.equals(ds));
		System.out.println(a==ds);
		System.out.println(a==b);

		if (a.equals(b)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		if (a == b)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
