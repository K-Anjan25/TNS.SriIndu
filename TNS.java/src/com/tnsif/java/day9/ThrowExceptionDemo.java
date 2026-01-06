package com.tnsif.java.day9;

public class ThrowExceptionDemo{
	public static void main(String [] args){
		int age = 12;
		if(age > 18)
		{
			System.out.println("Eligible for voting");
		}
		else{
			throw new ArithemeticException("The age is < 18 so not Eligible for voting");
		}
	}
}
