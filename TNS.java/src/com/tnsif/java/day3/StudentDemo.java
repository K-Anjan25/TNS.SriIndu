package com.tnsif.java.day3;

public class StudentDemo {
	public static void main(String [] args) {
		Student s=new Student();
		s.getsname("Anjan");
		s.getsid(101);
		s.getsmarks(100);
		System.out.println("Student Details:");
		System.out.println("Student Name: "+s.setsname());
		System.out.println("Student ID: "+s.setsid());
		System.out.println("Student Marks: "+s.setsmarks());
		
	}
}
