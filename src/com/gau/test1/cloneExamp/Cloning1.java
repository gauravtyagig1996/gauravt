package com.gau.test1.cloneExamp;

public class Cloning1 implements Cloneable {

	int Rollno;
	String Name;

	Cloning1(int Rollno, String Name) {

		this.Rollno = Rollno;
		this.Name = Name;
	}

	public Cloning1() {
		
	}

	public Object Clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static void main(String args[]) {

		try {
			Cloning1 s1 = new Cloning1(101, "Gaurav");
			Cloning1 s3 = new Cloning1();
			
			Cloning1 s2 = (Cloning1) s3.clone();

			System.out.println(s1.Rollno + " " + s1.Name);
			System.out.println(s2.Rollno + " " + s2.Name);
		} catch (CloneNotSupportedException c) {
		}

	}

}
