package com.gau.exceptation;

public class ExceptationN16 {
	public static void main(String[] args) {
		try{
			int a =25/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){System.out.println(e);}
		finally{System.out.println("finally hamesha hai");}
		System.out.println("rest code");
	}

}
