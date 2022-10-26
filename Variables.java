package com.codebode.project;

public class Variables {
	
	int a = 10; //instance variable
	public static int b = 30; //static variable
	
	public static void main(String args[])
	{
		int c = 50; // local variable
		
		//accessing static variable
		System.out.println("Static  variable: " +Variables.b);
		
		//accessing local variables
		System.out.println("Local variable: " +c);
		
		// creating an instance of class to access instance variable
		Variables obj = new Variables(); 
		System.out.println("Instance variable: " + obj.a);
		
		
	}

}
