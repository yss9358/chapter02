package com.javaex.ex18;

public class Triangle extends Shape {

	// 필드

	private int width;
	private int height;

	// 생성자

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

}
