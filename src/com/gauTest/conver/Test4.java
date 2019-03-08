package com.gauTest.conver;

class TestSuper5 {
	int id;
	String name;

	TestSuper5(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends TestSuper5 {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Test4 {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ankit", 45000f);
		e1.display();
	}

}
