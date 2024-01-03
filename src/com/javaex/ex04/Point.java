package com.javaex.ex04;

public class Point {
	
	//필드 
	
	private int x;
	private int y;
	
	// 생성자
	// 메소드 - g/s
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x="+ this.x + ", y=" + this.y + "]을 그렸습니다.");
	}
	
}
