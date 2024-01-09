package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Ractangle r01 =new Ractangle(2,2,"빨강","파랑");
		System.out.println(r01.getWidth());
		*/
		
		//부모만 보인다. 자식쪽은 사용 못함(set.(*$&#@&^-->안보임)
		//Ractangle r01 = new Ractangle(2,2,"빨강","파랑");
		Shape s01 = new Ractangle(2,2,"빨강","파랑");
		Shape s02 = new Triangle (100,100,"노랑","초록");
		Shape s03 = new Circle (200,"노랑","초록");

		Shape[] sArray = new Shape[3];
		
		sArray[0]= s01;
		sArray[1]= s02;
		sArray[2]= s03;
		
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i].toString());
			sArray[i].draw();
			} 
	}
	
	
	

}
