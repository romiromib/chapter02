package com.javaex.ex18;

public class ShapeApp {
	
	public static void main(String[]args) {
		
		//사각형(자식)
		Ractangle r01 = new Ractangle();
		r01.setWidth(3);
		r01.setHeight(3);
		r01.setFillColor("빨강");
		r01.setLineClolor("검정");
		
		System.out.println(r01.toString());
		
		//도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineClolor("검정");
		
		System.out.println(s01.toString());
		
		//
		Ractangle r02 = new Ractangle(40,40,"파랑","검정");
		System.out.println(r02.toString());
		
		
		Circle c01 = new Circle(3,"노랑","초록");
		Circle c02 = new Circle(7,"파랑","초록");
		System.out.println(c01.toString());
		System.out.println(c02.toString());
		
		Triangle t01 = new Triangle(2,3);
		t01.setFillColor("파랑");
		t01.setLineClolor("빨강");
		System.out.println(t01.toString());
		
		
		
	}
	
	
	
}
