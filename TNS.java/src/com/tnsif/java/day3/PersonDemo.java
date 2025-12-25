package com.tnsif.java.day3;
import java.util.Scanner;

public class PersonDemo {
	public static void main(String [] args)
	{
		Person p= new Person();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		p.pname=sc.nextLine();
		System.out.println("Enter Your Salary: ");
		p.psal=sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Your City: ");
		p.pcity=sc1.nextLine();
		p.ShowMethod();
	}
}
