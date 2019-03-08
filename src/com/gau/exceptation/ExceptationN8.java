package com.gau.exceptation;

public class ExceptationN8 {
	
	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[6];    
              a[5]=50/0;    
             }    
             catch(ArithmeticException e)  
                {  
            	 e.printStackTrace();
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }                
             System.out.println("rest of the code");    
  }  

}
