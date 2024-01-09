package com.javaex.ex17;

public class Ractangle {

	// 필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;
	

	// 생성자

	public Ractangle() {

	}

	public Ractangle(int width, int height, String fillColor, String lineColor ) {
		// 메모리에 올리는 일

		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		
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
		return "Ractangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("============================");
	}

	

}
