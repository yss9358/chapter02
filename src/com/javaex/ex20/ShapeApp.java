package com.javaex.ex20;

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

		//  System.out.println(sArray[0].toString());
		
		// 사각형의 기록값 가져오기 
		// ppt02-60  다운캐스팅
		// 자식클래스로 강제 형변환 시켜서 값을 확인해본다 ( (자식클래스)부모클래스 ) 형태
          
		//사각형의 가로값 구하기
		System.out.println(((Ractangle)sArray[0]).getWidth());
		
		//원의 반지름
		System.out.println(((Circle)sArray[2]).getRadius());
		
		//전체 면적구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
	}

}
