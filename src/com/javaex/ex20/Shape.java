package com.javaex.ex20;

public abstract class Shape {//abstract를 클래스 앞에 추가해서 단독으로 메모리에 올릴 수 없도록 함. -->추상 클래스
							 //메소드중에 abstract가 하나라도 존재하면 클래스에 abstract를 붙여줘야함(미완성이다라는 뜻)
							
//필드
	private String fillColor;
	private String lineClolor;
//생성자
	public Shape() {
		super();
	}
	public Shape(String fillColor, String lineClolor) {
		super();
		this.fillColor = fillColor;
		this.lineClolor = lineClolor;
	}
//메소드-s\gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineClolor() {
		return lineClolor;
	}
	public void setLineClolor(String lineClolor) {
		this.lineClolor = lineClolor;
	}
	
//메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineClolor=" + lineClolor + "]";
	}
	
	public void draw() { //자식한테 있는걸 쓰려고 추가했으므로, 비어있어도 무관함
		
	}
	
	//면적구하는 메소드
	//public double area(){
	//	return 0.0;
	//}
	//abstract를 추가하여 사용. 필요하니까 껍데기를 만들어 둠. -->추상 메소드
	public abstract double area();//내용이 없으니까 중괄호없이 정의만 함
								  //자식들은 무조건 area()를 만들어야 한다.
	
	
}
