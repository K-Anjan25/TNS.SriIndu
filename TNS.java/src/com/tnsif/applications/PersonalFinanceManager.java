package com.tnsif.applications;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalFinanceManager {
    private Map<String, Double> expenses;

    public PersonalFinanceManager() {
        this.expenses = new HashMap<>();
    }

    public void addExpense(String category, double amount) {
        if (expenses.containsKey(category)) {
            expenses.put(category, expenses.get(category) + amount);
        } else {
            expenses.put(category, amount);
        }
    }

    public void viewExpenses() {
        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PersonalFinanceManager financeManager = new PersonalFinanceManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    financeManager.addExpense(category, amount);
                    break;
                case 2:
                    financeManager.viewExpenses();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
