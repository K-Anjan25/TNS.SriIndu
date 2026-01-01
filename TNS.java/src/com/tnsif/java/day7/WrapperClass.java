package com.tnsif.java.day7;

public class WrapperClass {
	Integer intObj;
    Float floatObj;

    // Constructor
    public WrapperClass(int i, float f) {
        // Autoboxing
        intObj = i;
        floatObj = f;
    }

    // Methods to display values
    public void display() {
        System.out.println("Wrapped Integer value: " + intObj);
        System.out.println("Wrapped Float value: " + floatObj);
    }

    // Methods to return primitive values (Unboxing)
    public int getIntValue() {
        return intObj;   // unboxing
    }

    public float getFloatValue() {
        return floatObj; // unboxing
    }
}
