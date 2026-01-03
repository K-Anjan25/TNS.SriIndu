package com.tnsif.java.day4.inheritance;

class University {
    void provideDegrees() {
        System.out.println("University is providing degrees.");
    }
}

class College extends University {
    void conductExams() {
        System.out.println("College is conducting exams.");
    }
}

class Department extends College {
    void teachSubjects() {
        System.out.println("Department is teaching subjects.");
    }
}

public class MultiLevel {
		public static void main(String [] args) {
			Department department = new Department();
	        department.provideDegrees(); // Inherited from University
	        department.conductExams(); // Inherited from College
	        department.teachSubjects(); // Specific to Department

	}

}
