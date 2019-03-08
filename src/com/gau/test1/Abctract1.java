package com.gau.test1;

abstract class Bank {

	abstract float getrateofintrest();

}

class SBI extends Bank {

	float getrateofintrest() {
		return 1.5f;
	}
}

class RBI extends Bank {

	float getrateofintrest() {
		return 7.5f;
	}
}

class CBI extends Bank {

	float getrateofintrest() {
		return 9.5f;
	}
}

public class Abctract1 {

	public static void main(String args[]) {

		Bank b;

		b = new SBI();
		System.out.println("SBI RATE OF INTREST " + b.getrateofintrest());

		b = new RBI();
		System.out.println("RBI RATE OF INTREST " + b.getrateofintrest());

		b = new CBI();
		System.out.println("CBI RATE OF INTREST " + b.getrateofintrest());

	}
}