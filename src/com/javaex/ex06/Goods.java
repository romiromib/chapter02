package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;
	
	//생성자
	public Goods(){
		//메모리에 올리는 일 (클래스를 일스턴스화)
		System.out.println("Goods()");
	}
	public Goods(String name) {
		//메모리에 올리는 일 (클래스를 인스턴스화)
		this.name = name; //추가기능
		System.out.println("Goods(name)");
	}
	public Goods(String name, int price) {
		//메모리에 올리는 일 (클래스를 인스턴스화)
		//this.name = name;
		this(name); //기존생성자중에 1개를 호출(->public Goods(String name))
		this.price = price; //추가 1개
		System.out.println("Goods(name,price)");
	}
	

	
	//메소드-gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//일반
	
	@Override
	public String toString() {
		return "Goods() [name=" + name + ", price=" + price + "]";
	}
	
}
