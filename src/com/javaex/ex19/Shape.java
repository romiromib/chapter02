package com.javaex.ex19;

public class Shape {
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
	
}
