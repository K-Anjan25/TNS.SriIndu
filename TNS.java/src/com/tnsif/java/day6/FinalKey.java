package com.tnsif.java.day6;

public class FinalKey {
final int collegecode=1011;   //final variable cannot be changed
	
	final void show() {         // Final method cannot be overriden
		
		System.out.println("college code: "+collegecode);
		System.out.println("welcome to sriindu college");
	}

}
/*class demo extends Finalkey{
public void show()
{

}
}*/