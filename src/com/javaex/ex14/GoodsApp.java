package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods[] goodsArray = new Goods[5];
		
		Goods camera = new Goods("니콘",400000);
		Goods computer = new Goods("LG그램",900000);
		Goods cup = new Goods("머그컵", 2000);

		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
				
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();

		System.out.println(goodsArray[0]);
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[1]);
		System.out.println(goodsArray[1].getPrice());
		System.out.println(computer.getPrice());
		camera.showinfo();
		
		goodsArray[1].showinfo();
		
		int count = 0;
		for(int i=0; i<goodsArray.length; i++) {
			if (goodsArray[i]!=null) {
				goodsArray[i].showinfo();
				count = count +1;
			}
					
		}
		System.out.println("전체상품갯수:" + count);
	}
			
}


