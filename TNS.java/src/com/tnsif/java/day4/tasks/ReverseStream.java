package com.tnsif.java.day4.tasks;
import java.util.stream.Stream;

public class ReverseStream {
	public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "orange", "berry"};

        System.out.println("Original Stream:");
        Stream.of(words).forEach(System.out::println);

        System.out.println("\nReversed Stream:");
        Stream.of(words)
                .reduce((a, b) -> b + "\n" + a)
                .ifPresent(System.out::println);
    }

}
