package com.javaex.ex21;

public abstract class Shape {

	// 필드

	private String fillColor;
	private String lineColor;

	// 생성자

	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 g/s

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("");
	}

	// abstract 는 상속받는 자식클래스에게 이 메소드를 작성하라고 하는 키워드
	public abstract double area();

}
