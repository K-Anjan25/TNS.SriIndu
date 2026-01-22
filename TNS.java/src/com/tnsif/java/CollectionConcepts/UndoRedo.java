package com.tnsif.java.CollectionConcepts;

import java.util.Deque;
import java.util.LinkedList;

public class UndoRedo {
    public static void main(String[] args) {
        Deque<String> undoStack = new LinkedList<>();
        Deque<String> redoStack = new LinkedList<>();

        undoStack.push("Action 1");
        undoStack.push("Action 2");
        undoStack.push("Action 3");

        System.out.println("Undo Stack: " + undoStack);

        // Undo an action
        String undoneAction = undoStack.pop();
        redoStack.push(undoneAction);
        System.out.println("Undo Stack: " + undoStack);
        System.out.println("Redo Stack: " + redoStack);
    }
}
