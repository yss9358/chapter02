package com.javaex.ex22;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p01 = new Point(2,3);
		p01.draw();
		
		Point p02 = new Point();
		p02 = null;
		
		Point[] p = new Point[2];
		try {
			for(int i=0; i<p.length; i++)
			System.out.println("안녕하세요");
		} catch (NullPointerException e) {
			System.out.println("프로그램종료");

		}

		
		
	}
}
