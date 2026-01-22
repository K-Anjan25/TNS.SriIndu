package com.tnsif.java.CollectionConcepts;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> printQueue = new LinkedList<>();

        printQueue.add("Doc1");
        printQueue.add("Doc2");
        printQueue.add("Doc3");

        System.out.println("Print Queue: " + printQueue);
        System.out.println("Printing: " + printQueue.removeFirst());
        System.out.println("Print Queue after printing: " + printQueue);
    }
}
