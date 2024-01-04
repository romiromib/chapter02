package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {

		Point p0 = new Point();
		p0.setX(2);
		p0.setY(5);
		//System.out.println(p0.toString());
		p0.draw();
		
		Point p1 = new Point(2);
		p1.setY(22);
		System.out.println(p1.toString());
		
		Point p2 = new Point(100,50);
		System.out.println(p2.toString());
		
		
	}

}
