package com.javaex.ex20;

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
		
			//사각형의 가로값 가져오기
			System.out.println(((Ractangle)sArray[0]).getWidth());//((Ractangle)sArray[0]).getWidth()
			
			//원의 반지름
			System.out.println(((Circle)sArray[2]).getRadius());//((Circle)sArray[2]).getRadius()
		
			//전체 면적구하기
			for(int i=0;i<sArray.length;i++) {
				System.out.println(sArray[i].area());
			}
	}
	
	
	

}
