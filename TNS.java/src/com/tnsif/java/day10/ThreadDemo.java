package com.tnsif.java.day10;

public class ThreadDemo{
	public static void main(String [] args)
	{
		for(int i=0;i<5;i++){
			MultiThreads mt = new MultiThreads()
			mt.start();
			mt.sleep(5000);
		}
	}
}
