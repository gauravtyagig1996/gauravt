package stringS;

public class StringB13 {  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 StringB13(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){ 
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
		   StringB13 s1=new StringB13(102,"gaurav","dholpur");  
		   StringB13 s2=new StringB13(104,"saurav","agra");  
		     
		   System.out.println(s1);  
		   System.out.println(s2);  
		 }

}
