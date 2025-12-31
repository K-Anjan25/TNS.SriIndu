package com.tnsif.java.day5;

public class SuperKey {
	int a=10;
	SuperKey(int a){
		System.out.println("This is a constructor");
	}
	public void show() {
		System.out.println("This is a demo method");
		
	}

}
class Superdemo extends SuperKey {
Superdemo(){
	super(30); // calling parent class constructor
}
public void display() {
	System.out.println(super.a); // calling instance variable
     super.show(); // calling the parent class method
}
}