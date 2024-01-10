package com.javaex.ex22;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01 = new Point(2,2);
		p01.draw();
		
		Point p02;
		System.out.println("안녕하세요");
		
		try {
			
			p02= null; //주소가 없다
			p02.draw();
			
		}catch(NullPointerException n) {
			n.toString();
			System.out.println("또르르");
		}finally {
			
		}
		
		
		//p02= new Point(100,100); //다른곳에서 new 주소만 준다
		
		
		
		
		
	}

}
