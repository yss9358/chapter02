package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 부모의 디폴트 생성자 Point()를 호출해서 만들기
		// 부모의 Point(int x, int y) 생성자를 호출해서 만들기
		
		Point p01 = new Point(4,4);
		
		System.out.println(p01.toString());
		p01.draw();
		p01.x=4;
		
		ColorPoint cp1 = new ColorPoint("red");
		
		System.out.println(cp1.toString());
		cp1.draw();
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		System.out.println(cp2.toString());
		
		cp2.draw();
		
		

	}

}
