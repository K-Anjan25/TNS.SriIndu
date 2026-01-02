package com.tnsif.java.day7;

public class WrapperDemo {
	public static void main(String[] args) {

        int a = 100;
        float b = 45.75f;

        // Create Wrapper object
        WrapperClass w = new WrapperClass(a, b);

        // Display wrapped values
        w.display();
		
        // Get primitive values
		int intValue = w.getIntValue();
        float floatValue = w.getFloatValue();

        System.out.println("\nUnwrapped primitive values:");
        System.out.println("int value: " + intValue);
        System.out.println("float value: " + floatValue);
    }

}
