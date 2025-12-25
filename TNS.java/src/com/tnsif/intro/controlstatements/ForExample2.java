package com.tnsif.intro.controlstatements;

public class ForExample2 {
	public static void main(String [] args) {
		int rows = 5;

        // Print pyramid of stars
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
	}
}
