package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드 - g/s
	
	
	public void setName(String name) { // 저장할 땐 return 이 필요없으므로 void를 작성
		this.name = name;
	}
	
	public String getName() { // 저장한 값을 불러와야 되니까 리턴값을 나타낼 수있는 자료형을 사용
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반
	
	public void showInfo() {
		System.out.println("상품명: " + this.name + " , 가격: "+ this.price + "원");
	}
	

}
