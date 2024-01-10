package com.javaex.ex21;

public class Point implements Drawable {

	// 필드

	private int x;
	private int y;

	// 생성자

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 g/s

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		// 점을 시각화 하는 복잡한 로직작동
		System.out.println("======점을 그렸습니다=======");
		System.out.println("x좌표:" + x);
		System.out.println("y좌표:" + y);
		System.out.println("============================");
	}

}
