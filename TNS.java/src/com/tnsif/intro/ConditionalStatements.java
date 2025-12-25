package com.tnsif.intro;

public class ConditionalStatements {
	public static void main(String [] args) {
		int age = 25;
        String day = "Monday";
        int num = 10;

        // If-else statement example
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Switch statement example
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Ternary operator example
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is " + result);
	}
}
