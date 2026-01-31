package com.tnsif.java.day15;

public class TestVarargsMethod {
    public static class VarargsMethod {
        @SafeVarargs
        public final void printValues(String... values) {
            for (String value : values) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        VarargsMethod varargsMethod = new VarargsMethod();
        varargsMethod.printValues("Hello", "World", "!");
    }
}


