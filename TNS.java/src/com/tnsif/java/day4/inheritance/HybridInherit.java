package com.tnsif.java.day4.inheritance;

class Vehicle {
	 void move() {
	     System.out.println("Vehicle is moving.");
	 }
	}

	class Car extends Vehicle {
	 void drive() {
	     System.out.println("Car is driving.");
	 }
	}

	class SportsCar extends Car {
	 void speed() {
	     System.out.println("SportsCar is speeding.");
	 }
	}

public class HybridInherit {
	public static void main(String [] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.move(); // Inherited from Vehicle
        sportsCar.drive(); // Inherited from Car
        sportsCar.speed(); // Specific to SportsCar

	}
}
