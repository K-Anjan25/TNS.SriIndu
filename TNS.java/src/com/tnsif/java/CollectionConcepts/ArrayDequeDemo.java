package com.tnsif.java.CollectionConcepts;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> jobQueue = new ArrayDeque<>();

        jobQueue.add(1);
        jobQueue.add(2);
        jobQueue.add(3);

        System.out.println("Job Queue: " + jobQueue);

        System.out.println("Processing job: " + jobQueue.removeFirst());
        System.out.println("Job Queue after processing: " + jobQueue);
    }
}
