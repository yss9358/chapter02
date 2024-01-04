package com.javaex.ex06;

public class Goods {

	// 필드

	private String name;
	private int price;


	// 생성자
	// 생성자를 적지 않으면 기본적으로 default 값이 존재한다
	// 생성자를 추가로 사용 하고 싶으면 기본생성자를 먼저 적어주고 추가로 생성자를 적어야한다

	
	public Goods() {
		// 메모리에 올리는 일 ( 클래스를 인스턴스 화 )
		System.out.println("Goods()");

	}
	
	public Goods(String name) {
		this.name = name;
		System.out.println("Goods(name)");
	}
	
	public Goods(String name, int price) {
		this(name);
		this.price = price;
		System.out.println("Goods(name,price)");
	}

	// 메소드 - g/s
	
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

	


	// 메소드 - 일반
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
