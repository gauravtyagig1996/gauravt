package com.gau.test1;

public class InterF2 {

	public static void main(String args[]) {

		ank b;
		b = new BBI();
		System.out.println("Rate of intrest " + b.getrateofintrest());

		b = new ISBS();
		System.out.println("Rate of intrest " + b.getrateofintrest());

		b = new ABI();
		System.out.println("Rate of intrest " + b.getrateofintrest());
	}

}

class BBI implements ank {

	public float getrateofintrest() {
		return 5.6f;
	}

}

class ISBS implements ank {

	public float getrateofintrest() {
		return 7.8f;
	}

}

class ABI implements ank {

	public float getrateofintrest() {
		return 9.5f;
	}

}

interface ank {

	float getrateofintrest();
}
