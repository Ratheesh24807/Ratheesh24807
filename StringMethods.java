package com.codebode.project;

public class StringMethods {

	public static void main(String[] args) {

		String str = (" Hello ");
		//or 
		
		// String str = new String(" Hello ");
		
		
		System.out.println("String name: "+str);
        System.out.println("Total string length : "+str.length());
        System.out.println("Index of e is : "+str.indexOf("e"));
        System.out.println("Char at index 1 is : "+str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str = str.concat("Welcome"));
        System.out.println(str.trim());
        System.out.println(str.replace(" Hello", "Hi"));
        System.out.println(str);
        System.out.println(str.compareTo("hi"));
        System.out.println(str.compareTo(" Hello Welcome"));
        
        
		
	
	}

}
