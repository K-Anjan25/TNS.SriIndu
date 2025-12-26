package com.tnsif.java.day4.inheritance;

//Single Inheritance
class Animal {
 void eat() {
     System.out.println("Animal is eating.");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking.");
 }
}

//Multilevel Inheritance
class Mammal extends Animal {
 void walk() {
     System.out.println("Mammal is walking.");
 }
}

class Human extends Mammal {
 void think() {
     System.out.println("Human is thinking.");
 }
}

//Hierarchical Inheritance
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing.");
 }
}

class Lion extends Animal {
 void roar() {
     System.out.println("Lion is roaring.");
 }
}

//Hybrid Inheritance (Combination of Multilevel and Hierarchical)
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

public class Main {
	public static void main(String[] args) {
		// Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        Human human = new Human();
        human.eat();
        human.walk();
        human.think();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Lion lion = new Lion();
        lion.eat();
        lion.roar();

        // Hybrid Inheritance
        SportsCar sportsCar = new SportsCar();
        sportsCar.move();
        sportsCar.drive();
        sportsCar.speed();
    }
}
