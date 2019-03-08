package com.gau.inharitance;

public class InheriN1 {
	
	float salary = 20000;

}
 
class InheritB extends InheriN1{
	
	int bonus = 10000;
	
	public static void main(String args[]){
		
		InheritB I=new InheritB();
		
		System.out.println("InheriN1 salary = "+I.salary);
		System.out.println("InheritB bonus= "+I.bonus);
		
	}
	
}