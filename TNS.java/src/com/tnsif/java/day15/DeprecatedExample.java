package com.tnsif.java.day15;

public class DeprecatedExample {
    static class OldCalculator {
        @Deprecated
        public void calculate(int value) {
            System.out.println("Value: " + value);
        }

        public void calculateNew(int value) {
            System.out.println("New Value: " + value);
        }
    }

    public static void main(String[] args) {
        OldCalculator calculator = new OldCalculator();
        calculator.calculate(10); // Warning: The method calculate(int) from the type DeprecatedExample.OldCalculator is deprecated
        calculator.calculateNew(10);
    }
}

