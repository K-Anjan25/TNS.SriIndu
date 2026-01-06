package com.tnsif.java.tasks.task2;

import java.util.Scanner;

public class MultiplicationDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		MultiplicationTable mt=new MultiplicationTable();
		mt.table(number);
		

	}
}
