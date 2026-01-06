package com.tnsif.java.tasks.task2;

public class TypeConversion {
	void show() {
		int a=10;
		double b=a;
		System.out.println("Implicit TypeConversion\n");
		System.out.println("Int value: "+a);
		System.out.println("Double value: "+b+"\n");
		
		//Explicit type conversion
		double x=45.67;
		int y=(int)x;
		System.out.println("Explicit TypeCoversion\n");
		System.out.println("Double value: "+x);
		System.out.println("Int value: "+y);
		
		
	}
}
