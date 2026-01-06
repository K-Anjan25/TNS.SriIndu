package com.tnsif.java.day9;

public class ExceptionDemo{
	public static void main(String [] args){
		try{
			int a,b;
			a = 10;
			b = 0;
			int c = a/b;
		}catch(Exception e){
					System.out.println("The division is not possible");
				}
		try{
			int[] arr = {1,2,3,4};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}catch(Exception e){
					System.out.println("You can't read the value of arr[4]");
				}
		try{
			String s = null;
			System.out.println(s.length());
		}catch(Exception e){
					System.out.println("The String value is null");
				}
	}
}
