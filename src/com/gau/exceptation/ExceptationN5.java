package com.gau.exceptation;

public class ExceptationN5 {
	
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; 
        System.out.println(data);
  
        }  
             
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  

}
