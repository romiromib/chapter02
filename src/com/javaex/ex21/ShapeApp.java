package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		//그릴 수 있는 애 Drawable
		Drawable d01 = new Ractangle(100,100,"빨강","빨강");
		//d01.draw();
		Drawable d02 = new Point(2,2);
		//d02.draw();
		Drawable d03 = new Circle(3,"노랑","파랑");
		//d03.draw();
		Drawable d04 = new Ractangle(7,5,"빨강","빨강");
		//d04.draw();
		
		
		Drawable[] dArray = new Drawable[4];
		
		//배열에 주소 넣기
		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;
		
		
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로
		((Ractangle)dArray[0]).getWidth();
		
		//원의 넓이
		((Circle)dArray[2]).area();
		
		//전체에서 도형의 넓이를 출력
		for(int i=0;i<dArray.length;i++) {
			
			if(dArray[i]instanceof Shape) {
				//현재 배열의 방주소를 따라가서 Shape가 있으면
				System.out.println(((Shape)dArray[i]).area());//Point는 없으므로 출력이 안됨
			}
			
		}
		
		
	}
	
	
	

}
