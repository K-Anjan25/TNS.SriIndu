package com.tnsif.java.tasks.task4;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException

            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

