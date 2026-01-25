package com.tnsif.applications;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;

        while (true) {
            System.out.println("Guess a number between 0 and 99:");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            }
        }
    }
}
