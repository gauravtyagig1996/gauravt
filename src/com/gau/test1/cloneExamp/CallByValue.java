package com.gau.test1.cloneExamp;

public class CallByValue {

	static int data = 50;

	void change(int data) {
		data = data + 100;
		System.out.println(data);
	}

	public static void main(String args[]) {
		CallByValue cv = new CallByValue();

		System.out.println("before change " + cv.data);
		cv.change(500);
		System.out.println("after change " + cv.data);

	}

}
