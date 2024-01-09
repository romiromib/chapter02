package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		//관리를 위한 배열 생성(주소를 담을 아파트만들기)
		Ractangle[] rArray = new Ractangle[3];
			
		//사각형 생성
		Ractangle r01 = new Ractangle(5,10,"파랑","빨강");
 		Ractangle r02 = new Ractangle(10,10,"노랑","노랑");
 		Ractangle r03 = new Ractangle(20,20,"빨강","빨강");
 		
 		//배열에 사각형(주소) 담기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
 		
		//배열을 통해 사각형 그리기
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();	
		}
		/////////////////////////////////////////////////
		//
		//관리를 위한 배열 생성(주소를 담을 아파트만들기)
		Triangle[] tArray = new Triangle[3];
		
		//삼각형 생성
		Triangle t01 = new Triangle(5,10,"파랑","빨강");
		Triangle t02 = new Triangle(10,10,"노랑","주황");
		Triangle t03 = new Triangle(20,10,"노랑","빨강");
		
		//배열에 삼각형(주소) 담기
		tArray[0]=t01;
		tArray[1]=t02;
		tArray[2]=t03;
		
		//배열을 통해서 삼각형 그리기
		for(int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}
		
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle(2,"빨강","노랑");
		Circle c02 = new Circle(3,"빨강","노랑");
		Circle c03 = new Circle(5,"파랑","초록");
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0;i<tArray.length;i++) {
			cArray[i].draw();
		}
		
		
		/*
 		System.out.println(r01.toString());
 		System.out.println(r02.toString());
 		System.out.println(r03.toString());
 		
 		r01.draw();
 		r02.draw();
 		r03.draw();
 		*/
		
	}
	
	

}
