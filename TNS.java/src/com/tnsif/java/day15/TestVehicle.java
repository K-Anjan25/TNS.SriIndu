package com.tnsif.java.day15;

public class TestVehicle {
    public static class Vehicle {
        public void sound() {
            System.out.println("The vehicle makes a sound");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void sound() {
            System.out.println("The car beeps");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.sound();
    }
}
