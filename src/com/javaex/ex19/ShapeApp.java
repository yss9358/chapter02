package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//부모만 보인다.. 자식쪽은 사용 못함
		
		Shape s01 = new Ractangle(20,20,"빨강","빨강");
		
		Shape s02 = new Triangle(100, 100, "빨강","빨강");
		
		Shape s03 = new Circle(200, "빨강","파랑");
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for (int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}

		System.out.println(sArray[0].toString());
		
		
		
		
	}

}
