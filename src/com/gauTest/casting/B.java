package com.gauTest.casting;

public class B extends A {
	public static void main(String[] args) {
		B b = new B();
		A a = new B(); // upcasting
	//	B ab = (B)new A()//down Casting 
				;
		int sa=10;
	
		if (b instanceof B)
			System.out.println(true);
		else
			System.out.println(false);

		String aa="AKZPT";
		int i=2123;
		String bb="S";
String pan=aa+i+bb;
System.out.println(pan);
	}
	
}
