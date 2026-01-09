package com.tnsif.java.day11;

public class ThreadDemoClass{
	
	int i;
	boolean flag=false;

	synchronized void deliver(int i)
	{
		if(flag){
			try{
				wait();
			}catch(Exception e){
				System.err.println(e);
			}
		}
		this.i=1;
		flag = true;
		System.out.println("The msg is delivered "+i);
		notify();
	}

	synchronized int receiver()
	{
		if(!flag){
			try{
				wait();
			}catch(Exception e){
				System.err.println(e);
			}
		}
		System.out.println("The msg is received "+i);
		flag = false;
		notify();
		return i;
	}
}
		
		
