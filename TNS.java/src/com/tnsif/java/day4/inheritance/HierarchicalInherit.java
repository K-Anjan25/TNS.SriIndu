package com.tnsif.java.day4.inheritance;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle extends Shape {
    void drawTriangle() {
        System.out.println("Drawing a triangle.");
    }
}

public class HierarchicalInherit {
			public static void main(String [] args) {
				Circle circle = new Circle();
		        circle.draw();
		        circle.drawCircle();

		        Rectangle rectangle = new Rectangle();
		        rectangle.draw();
		        rectangle.drawRectangle();

		        Triangle triangle = new Triangle();
		        triangle.draw();
		        triangle.drawTriangle();

		}

}
