package com.gau.inharitance;

public class UserClass extends SampleClass {
	public String concaUserClass(String fName, String lName) {
		return fName + " " + lName;
	}
	
	public static void main(String[] args) {
		UserClass uc = new UserClass();
		System.out.println(uc.concat("Gaurav", "Tyagi"));
		String value = uc.concat("Gaurav", "Tyagi");
		System.out.println("Value :" + value);
		if (uc.concat("Gaurav1", "Tyagi").equals("Gaurav Tyagi")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
