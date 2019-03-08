package com.gauTest.conver;

public class Test6 {  
	    int speed;  
	      
	    Test6(){System.out.println("constructor is invoked");}  
	   
	    {System.out.println("instance initializer block invoked");}  
	       
	    public static void main(String args[]){  
	    Test6 b1=new Test6();  
	    Test6 b2=new Test6();  
	    } 

}
