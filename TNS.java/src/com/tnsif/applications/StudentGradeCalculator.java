package com.tnsif.applications;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name:");
        String name = scanner.nextLine();
        System.out.println("Enter student's grade (out of 100):");
        double grade = scanner.nextDouble();

        if (grade >= 90) {
            System.out.println(name + "'s grade is A");
        } else if (grade >= 80) {
            System.out.println(name + "'s grade is B");
        } else if (grade >= 70) {
            System.out.println(name + "'s grade is C");
        } else if (grade >= 60) {
            System.out.println(name + "'s grade is D");
        } else {
            System.out.println(name + "'s grade is F");
        }
    }
}
