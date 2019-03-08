package com.gau.test1.cloneExamp;

public class CloneClass implements Cloneable{
	String name;
	int age;

	public Object clone() throws CloneNotSupportedException{
		
		
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneClass cc = new CloneClass();

		
			CloneClass sa = (CloneClass) cc.clone();

			
			
			
			
			
			
			
		

		
	}
}
