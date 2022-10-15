package com.simple;

public class Person {
	int height;
	int weight;
	
	Person(int h,int w){
		this.height = h;
		this.weight = w;
		
	}
	
	void print() {
		System.out.println("My height is : " + this.height);
		System.out.println("My weight is : " + this.weight);
	}

	public static void main(String[] args) {
		Person A = new Person(5,55);
		Person B = new Person(6,75);
		A.print();
        B.print();
	}

}
