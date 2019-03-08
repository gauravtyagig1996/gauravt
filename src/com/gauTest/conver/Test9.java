package com.gauTest.conver;

public class Test9 {

	public static void main(String args[]) {

		bank b;
		b = new SBI();
		System.out.println("Rate of intrest " + b.getrateofintrest());

		b = new ISBS();
		System.out.println("Rate of intrest " + b.getrateofintrest());

		b = new CBI();
		System.out.println("Rate of intrest " + b.getrateofintrest());
	}

}

class SBI extends bank {

	float getrateofintrest() {
		return 5.6f;
	}

}

class ISBS extends bank {

	float getrateofintrest() {
		return 7.8f;
	}

}

class CBI extends bank {

	float getrateofintrest() {
		return 9;
	}

}

class bank {

	float getrateofintrest() {
		return 0;
	}
}