package com.tnsif.java.day5;

public class Polymorphism {
	int Rno=135;
	String Name="Anjan";
	float CGPA=7.6f;
	public void details(int a) {
		System.out.println("RNO: "+Rno);
	}
	public void details(String a) {
		System.out.println(a+" "+ Name );
	}
	public void details(float b,String a) {
		System.out.println("you got "+CGPA+" "+a);
		
	}

}
