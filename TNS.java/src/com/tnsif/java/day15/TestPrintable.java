package com.tnsif.java.day15;


@FunctionalInterface
public interface Printable {
    void print(String message);
}



public class TestPrintable {
    public static void main(String[] args) {
        Printable printer = message -> System.out.println(message);
        printer.print("Hello, World!");
    }
}
