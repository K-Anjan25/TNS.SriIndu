package com.tnsif.java.day15;

import java.util.HashMap;

public class LambdaWithMap {
	

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("ANJAN", 59);
		hm.put("MANISH", 9);
		hm.put("SHIVA", 7);
		
		hm.forEach((key,value)->System.out.println("NAMES:"+key+"ROLL.NO:"+value));

	}

}
