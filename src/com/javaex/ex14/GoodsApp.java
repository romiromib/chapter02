package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
				
		//배열만들기
		Goods[] goodsArray = new Goods[3];
		
		//상품만들기
		Goods camera = new Goods("니콘",400000);
		Goods computer = new Goods("LG그램",900000);
		Goods cup = new Goods("머그컵",2000);
		
		//배열에 상품주소 넣기
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		//System.out.println(camera.getName());
		//System.out.println(goodsArray[0].getName());
		
		//camera.showInfo();
		//goodsArray[0].showInfo();
		
	/*	for(int i=0;i<goodsArray.length;i++) {
			if(goodsArray[i] != null) {//null:주소가 없음
				goodsArray[i].showInfo();
			}
	*/
			
			int count = 0;
		for(int i=0;i<goodsArray.length;i++) {
			if(goodsArray[i] != null) {
				goodsArray[i].showInfo();
				count = count+1;
			
				//sum = sum+1;
				//sum+=1;
				//sum = sum*2;
				//sum*=2;
		}
		
		}System.out.println("상품갯수:"+count+"개");

	}

}
