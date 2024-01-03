package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// camera
		Goods camera = new Goods();
		
		
		// camera.name = "니콘"; private 캡슐화 진행
		camera.setName("니콘");
		//camera.price = 400000;
		camera.setPrice(400000);
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		// computer
		
		Goods computer = new Goods();
		
		computer.setName("Lg그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		camera.showInfo();
		computer.showInfo();
				
	}

}
