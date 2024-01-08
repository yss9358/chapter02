package com.javaex.ex16;

public class ColorPoint extends Point {

	// 필드

	private String color;

	// 생성자

	public ColorPoint() {
		System.out.println("ColorPoint(1)");
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
		System.out.println("ColorPoint(2)");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}

	// 메소드 - g/s

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드 - 일반

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void draw() {
		System.out.println("점 [x= " + super.x + ", y= " + this.getY() + " , " + color + "]을 그렸습니다.");
	}

}
