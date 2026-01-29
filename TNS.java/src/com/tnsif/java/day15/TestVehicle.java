package com.tnsif.java.day15;

public class Vehicle {
    public void sound() {
        System.out.println("The vehicle makes a sound");
    }
}


public class Car extends Vehicle {
    @Override
    public void sound() {
        System.out.println("The car beeps");
    }
}


public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.sound();
    }
}

