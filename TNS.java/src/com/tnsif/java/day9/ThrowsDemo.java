package com.tnsif.java.day9;

class sample{
	public void show() throws Exception {
		try {
			int a = 10,b = 0;
			int c = a/b;
			System.out.println(c);
			
			}finally {
				System.out.println("This is Finally block");
			}
	}
	
}



public class ThrowsDemo {

	public static void main(String[] args) throws Exception {
			sample s = new sample();
			s.show();
	}

}
