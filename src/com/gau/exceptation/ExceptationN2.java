package com.gau.exceptation;

public class ExceptationN2 {
	
	public static void main(String[] args) {
		
		try{
		int a=50/0;
		System.out.println(a);
		System.out.println("rest code");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
