package com.tnsif.java.CollectionConcepts;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    public static void main(String[] args) {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        backStack.push("Google");
        backStack.push("Facebook");
        backStack.push("YouTube");

        System.out.println("Back Stack: " + backStack);

        // Go back to previous page
        String currentPage = backStack.pop();
        forwardStack.push(currentPage);
        System.out.println("Current Page: " + backStack.peek());
        System.out.println("Forward Stack: " + forwardStack);
    }
}
