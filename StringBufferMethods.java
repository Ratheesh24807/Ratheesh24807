package com.codebode.project;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Hello, Good morning");
		System.out.println(str);
		System.out.println(str.append(" Have a nice day"));
		System.out.println(str.delete(0, 7));
		System.out.println(str.replace(5, 12, "Night"));
		System.out.println(str.reverse());

	
		
	}

}
