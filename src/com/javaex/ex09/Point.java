package com.javaex.ex09;

public class Point {
//필드
	private int x;
	private int y;
	
//생성자
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Point(int x,int y)");
	}
	

	
//메소드-gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


//메소드-일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x="+getX()+", y="+getY()+"]을 그렸습니다.");
	}
	
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+getX()+", y="+getY()+"]을 그렸습니다.");
		}
		else {
			System.out.println("점[x="+getX()+", y="+getY()+"]을 지웠습니다.");
		}
		
	}
	
}
