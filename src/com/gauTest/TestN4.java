package com.gauTest;

public class TestN4 {  
		static int id;  
		 static String name;
		public TestN4() {
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "TestN4 [id=" + id + ", name=" + name + "]";
		} 
		 
		}  
		class test5{  
		 public static void main(String args[]){  
			 TestN4 s1=new TestN4();  
		   s1.setId(1111);
		   s1.setName("Gaurav");
		  System.out.println(s1.getId()+" "+s1.getName());  
		 }

}
