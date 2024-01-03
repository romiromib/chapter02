package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		//camera.name = "니콘"; private 캡슐화
		camera.setName("니콘");
		
		//camera.price = 400000; private 캡슐화
		camera.setPrice(400000);
		
		
		//System.out.println(camera.name);
		System.out.println(camera.getName());
		
		//System.out.println(camera.price);
		System.out.println(camera.getPrice());
		
		//computer
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		camera.showInfo();
		
	}

}
