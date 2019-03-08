package com.gauTest.superOne;

public class MainJava extends HelloJava {
	String name = "Hello Gaurav";
	int i = 12;

	
	public String add(String lName) {
		return super.name + " " + lName + " " + super.sume(12, 13);
	}

	public static void main(String[] args) {

		MainJava mj = new MainJava();
		System.out.println(mj.add("Tyagi"));

	}
}
