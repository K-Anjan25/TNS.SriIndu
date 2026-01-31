package com.tnsif.java.day15;

public class TestPrintable {
    @FunctionalInterface
    interface Printable {
        void print(String message);
    }

    public static void main(String[] args) {
        TestPrintable.Printable printer = message -> System.out.println(message);
        printer.print("Hello, World!");
    }
}
