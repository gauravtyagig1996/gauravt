package com.gauTest.superOne;

public class InstancInslagierBlock {
	String fName;
	String lName;
	{
		fName="Saurav";
		lName="Tyagi";
	}
	public String getName(String fName, String lName) {
		System.out.println(this.fName+" "+this.lName);
		System.out.println(fName+" "+lName);
		return fName + " " + lName;
	}

	public static void main(String[] args) {
		new InstancInslagierBlock().getName("Hello", "Java");
		System.out.println("XYZ");
	}

}
