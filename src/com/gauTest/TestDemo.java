package com.gauTest;

public class TestDemo {
	static boolean bb;
	
	public void testMeth(){
		System.out.println(bb);
		bb=true;
		System.out.println(bb);
	}
	public void testMeth1(){
		
		System.out.println(bb);
	}
  

	public static void main(String[] args) {
		TestDemo tm=new TestDemo();
		tm.testMeth();
		tm.testMeth1();
		tm.testMeth();
	}

}
