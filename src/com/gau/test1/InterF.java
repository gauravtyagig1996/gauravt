package com.gau.test1;

public class InterF implements printable {

	public void print() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		InterF obj = new InterF();
		obj.print();
	}
}

interface printable {
	void print();
}
