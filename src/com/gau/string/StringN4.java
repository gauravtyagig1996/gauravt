package com.gau.string;

public class StringN4 {
	public static void main(String[] args) {

		String s1 = "gaurav";
		String s2 = "gaurav";
		String s3 = new String("gaurav");
		String s4 = "tyagi";

		System.out.println(s4.equals(s1));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s2.equals(s1));//true
		System.out.println(s3.equals(s4));////false
		System.out.println(s1==s3);

	}
}
