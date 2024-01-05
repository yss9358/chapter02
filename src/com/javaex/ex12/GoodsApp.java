package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Goods.count);
		
		
		Goods camera = new Goods("니콘", 400000);
		
		System.out.println(camera.toString());
		
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		
		System.out.println(cup.toString());
		
		

	}

}
