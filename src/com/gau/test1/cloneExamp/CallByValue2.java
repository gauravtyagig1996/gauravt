package com.gau.test1.cloneExamp;

public class CallByValue2 {

	int data = 50;

	void change(CallByValue2 cc) {

		cc.data = cc.data + 100;
	}

	public static void main(String args[]) {

		CallByValue2 cc = new CallByValue2();
		System.out.println("Before Change " + cc.data);
		cc.change(cc);
		System.out.println("After Change " + cc.data);

	}

}
