package com.tnsif.java.tasks.task1;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, digits);
            num /= 10;
        }

        return original == result;
    }
}
