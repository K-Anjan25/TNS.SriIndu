package com.tnsif.java.day4.inheritance;

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

public class SingleInherit {
	public static void main(String[] args) {
		// Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        }
}
