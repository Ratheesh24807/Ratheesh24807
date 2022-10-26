package com.codebode.project;

public class Constructor {
	
	int roll_no;
	String name;
	
	Constructor() //Default constructor
	{
		name = "RajKumar";
		roll_no = 123;
		
	}
	
	Constructor(String str, int n) // parameterized constructor
	
	{
		 name = str;
		roll_no = n;
	}
	
	public static void main (String args[]) {
	
		Constructor s1 = new Constructor();
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		Constructor s2 = new Constructor("Krishna",456);
		System.out.println(s2.name);
		System.out.println(s2.roll_no);
		

	}

}
