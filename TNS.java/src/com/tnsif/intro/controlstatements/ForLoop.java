package com.tnsif.intro.controlstatements;

public class ForLoop {
	public static void main(String [] args) {
		// Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Print even numbers from 2 to 20
        System.out.println("\n\nEven numbers from 2 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        // Print the sum of numbers from 1 to 10
        int sum = 0;
        System.out.println("\n\nSum of numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            sum += i;
		}
        System.out.println("Sum: " + sum);
	}
}
