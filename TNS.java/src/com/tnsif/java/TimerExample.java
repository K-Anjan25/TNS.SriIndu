package com.tnsif.java;

public class TimerExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            // Simulating some work
            Thread.sleep(2000);
            int x = 10 / 0; // This will throw an exception
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
        }
    }
}
