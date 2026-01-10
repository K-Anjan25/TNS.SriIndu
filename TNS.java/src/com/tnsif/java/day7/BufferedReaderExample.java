package com.tnsif.java.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// Reading input as a string and converting it
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(reader.readLine());
		
		System.out.print("Enter a double: ");
		double decimal = Double.parseDouble(reader.readLine());

		System.out.print("Enter a string: ");
		String text = reader.readLine();
		System.out.println("\nYou entered:");
		System.out.println("Integer: " + num);
		System.out.println("Double: " + decimal);
		System.out.println("String: " + text);
	}
}
