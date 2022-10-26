package com.codebode.project;

public class StaticVariablesBlock {
	static int a = 20;
	
	 void display()  // Instance method 
	{
		System.out.println("This is Display method");
		
	}

	static void create()
	{
		System.out.println("This is just static");
	}




	
	public static void main (String args[]) {
		
		// creating an object to invoke instance method
		
		StaticVariablesBlock obj = new StaticVariablesBlock();
		System.out.println(StaticVariablesBlock.a);
		obj.display(); // calling instance method with the help of object
	}
    }
