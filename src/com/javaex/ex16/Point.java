package com.javaex.ex16;

public class Point {
//필드	
	protected int x; // 상속받는 자식은 접근이 가능함(같은 패키지에 있는 클래스에서는 사용가능)
	private int y;
//생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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

	public void showInfo() {
		System.out.println(this.x+","+this.y);
	}
	
}
