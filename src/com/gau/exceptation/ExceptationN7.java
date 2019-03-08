package com.gau.exceptation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptationN7 {
	public static void main(String[] args) {
		
		PrintWriter pw;
		
		try{
			pw=new PrintWriter("gaurav.txt");
			pw.println("saved");
		}
		
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		System.out.println("file saved successfully");

	}

}
