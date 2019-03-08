package com.gau.string;

public class StringN6 {

	public static void main(String[] args) {
		String s1 = "Gaurav";
		String s2 = "gaurav";
		String s3 = "gaurav";
		String s4 = new String("gaurav");

		System.out.println(s1 == s2);//false 
		System.out.println(s2 == s3);//true
		System.out.println(s3 == s2);//true
		System.out.println(s4 == s2);//false
		System.out.println(s4 == s1);//false
	}

}
