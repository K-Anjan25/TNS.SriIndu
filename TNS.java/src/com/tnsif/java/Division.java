package com.tnsif.java;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
