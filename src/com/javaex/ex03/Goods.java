package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드-gs
	public void setName(String n) {
		name = n;
	//this name = name;
	}
	public void setPrice(int p) {
		price = p;
	//this price = price;
	}
	
	public String getName() {
		return name;
			 //this.name;
	}
	public int getPrice() {
		return price;
			// this.price;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println("상품명: "+this.name+", 가격: "+this.price);
	}

	
	
	
	
	
}
