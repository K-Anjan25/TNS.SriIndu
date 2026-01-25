package com.tnsif.applications;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    private Map<String, String> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully!");
    }

    public void viewContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found!");
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. View contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addContact(name, phoneNumber);
                    break;
                case 2:
                    phonebook.viewContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    phonebook.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
