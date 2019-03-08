package com.gau.exceptation;

public class ExceptationN1 {
	
	 public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; 
	     
	        }  
	            
	        catch(ArithmeticException e)  
	        {  
	        	e.printStackTrace();
	            //System.out.println(e);    
	    } 
	        System.out.println("rest code");
	      
	}
	 }  
