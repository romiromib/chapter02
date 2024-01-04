package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(40000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG그램"); //이런형식으로 사용하려면 생성자를 만들어줘야 함
		//computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(camera.toString());
		
		Goods cup = new Goods("머그컵",5000);
		System.out.println(cup.toString());
		
	
	}

}
