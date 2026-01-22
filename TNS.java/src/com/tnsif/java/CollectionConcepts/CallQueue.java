package com.tnsif.java.CollectionConcepts;

import java.util.Deque;
import java.util.LinkedList;

public class CallQueue {
    public static void main(String[] args) {
        Deque<String> callQueue = new LinkedList<>();

        callQueue.add("John");
        callQueue.add("Emma");
        callQueue.add("Michael");

        System.out.println("Call Queue: " + callQueue);
        System.out.println("Answering call from: " + callQueue.removeFirst());
        System.out.println("Call Queue after answering: " + callQueue);
    }
}
