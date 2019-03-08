package com.gauTest.conver;

public class Test5 {

	int speed;

	Test5() {
		System.out.println("speed is" + speed);
	}

	{
		speed = 100;
	}

	public static void main(String args[]) {
		
		Test5 T=new Test5();
		T.speed();

	}

}
