package com.tnsif.java.day1;

public class LogicalDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Logical AND (&&)
        System.out.println("a && b: " + (a && b));

        // Logical OR (||)
        System.out.println("a || b: " + (a || b));

        // Logical NOT (!)
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);

        // Example usage
        int age = 25;
        boolean isStudent = true;
        boolean isDiscountApplicable = age < 30 && isStudent;
        System.out.println("Is Discount Applicable: " + isDiscountApplicable);
    }
}

