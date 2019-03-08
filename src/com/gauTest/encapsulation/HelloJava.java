package com.gauTest.encapsulation;

public class HelloJava {

	private String name;
	private String addres;
	private int age;
	private int mobNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "HelloJava [name=" + name + ", addres=" + addres + ", age=" + age + ", mobNo=" + mobNo + "]";
	}

}
