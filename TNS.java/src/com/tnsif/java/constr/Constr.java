package com.tnsif.java.constr;

public class Constr {
	Constr(){
		System.out.println("This is parent");
	}
	}

class Child extends Constr{
	public void Constr() {
		System.out.println("This is child");
	}
}
	
