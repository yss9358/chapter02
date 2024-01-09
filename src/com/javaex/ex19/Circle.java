package com.javaex.ex19;

public class Circle extends Shape {

	// 필드

	private int radius;

	// 생성자

	public Circle() {
		super();
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.radius = radius;
	}

	// 메소드 g/s

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	
	public void draw() {
	    // 원을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("반지름:" + radius);
	    System.out.println("면색:" + super.getFillColor());
	    System.out.println("선색:" + super.getLineColor());
	    System.out.println("============================");
	}

}
