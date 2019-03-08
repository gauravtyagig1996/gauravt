package com.gau.test1;

class Incap {
	private String name, address, collage, mobile;

	// naw start getter shatter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Incap [name=" + name + ", address=" + address + ", collage=" + collage + ", mobile=" + mobile + "]";
	}

}

public class Incap2 {

	public static void main(String args[]) {

		Incap i = new Incap();
		
		i.setName("GAURAV TYAGI");
		i.setAddress("DHOLPUR");
		i.setCollage("SBBJ");
		i.setMobile("abb");
		
		System.out.println(i);
		
		
		System.out.println(i.getName() + " " + i.getAddress() + " " + i.getCollage() + " " + i.getMobile());

	}
}