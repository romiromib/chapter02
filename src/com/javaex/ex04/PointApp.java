package com.javaex.ex04;

public class PointApp {

	public static void main(String[]args) {
		
		Point area1 = new Point();
		area1.setX(5);
		area1.setY(5);
		
		Point area2 = new Point();
		area2.setX(10);
		area2.setY(23);
		
		area1.draw();
		area2.draw();
	}
}
