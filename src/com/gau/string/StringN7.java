package com.gau.string;

public class StringN7 {
	public static void main(String[] args) {
		String s1 = "gaurav";
		String s2 = "Gaurav";
		String s3 = "tysgi";
		String s4 = new String("gaurav");
		String s5 = "gaurav";

		System.out.println(s1.compareTo(s2)); // compare to method
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s5.compareToIgnoreCase(s2));
		System.out.println(s5.compareTo(s4));
	}
}
