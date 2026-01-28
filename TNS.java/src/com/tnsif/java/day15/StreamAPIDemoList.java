package com.tnsif.java.day15;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemoList {

	public static void main(String[] args) {
		
		//Stream API using List Collection
		//examples:- (1,2,3,42,46,68,586)
				List<Integer> l = Arrays.asList(1,2,3,42,46,68,586);
				l.stream().
				filter(n->n%2==0).
				forEach(System.out::println);

	}

}
