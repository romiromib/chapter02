package com.javaex.ex16;

public class ColorPoint extends Point{
//필드
	private String color;

//생성자

	public ColorPoint(String color) {
	super();
	this.color = color;
}


	public ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	//메소드-gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
//메소드-일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void showInfo() {
		System.out.println(x+","+getY()+","+this.color);//x는 protected이므로 접근이 가능함
	}
	
	
	
	

	
	
	
	
}
