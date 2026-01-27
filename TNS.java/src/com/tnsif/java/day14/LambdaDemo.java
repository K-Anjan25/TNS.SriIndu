package com.tnsif.java.day14;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
	public static void main(String[] args) {
		Lambda l = ()->
		System.out.println("This is LAMBDA");
		l.print();
		Predicate<Integer> p=(n)->n%2==0;
		System.out.println(p.test(3));
			
		Consumer<String> con=(name)->
		System.out.println(name.toUpperCase());
		con.accept("HELLO");
			
		Supplier<Double> s=()->
		Math.random();
		System.out.println(s.get());

	}

}
