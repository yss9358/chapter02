package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 부모만 보인다.. 자식쪽은 사용 못함
		
		  Shape s01 = new Ractangle(20, 20, "빨강", "빨강");
		  
		  Shape s02 = new Triangle(100, 100, "빨강", "빨강");
		  
		  Shape s03 = new Circle(200, "빨강", "파랑");
		  
		  Shape[] sArray = new Shape[3];
		  
		  sArray[0] = s01; sArray[1] = s02; sArray[2] = s03;
		  
		  for (int i=0; i<sArray.length; i++) { sArray[i].draw(); }
		  
		  // System.out.println(sArray[0].toString());
		  
		  // 사각형의 기록값 가져오기 // ppt02-60 다운캐스팅 // 자식클래스로 강제 형변환 시켜서 값을 확인해본다 ((자식클래스)부모클래스 ) 형태
		  
		  //사각형의 가로값 구하기 System.out.println(((Ractangle)sArray[0]).getWidth());
		  
		  //원의 반지름 System.out.println(((Circle)sArray[2]).getRadius());
		  
		  //전체 면적구하기 
		  for(int i=0; i<sArray.length; i++) {
		  System.out.println(sArray[i].area()); }
		

		// 그릴수있는것 = Drawable 지정

		// 사각형
		Drawable d01 = new Ractangle(100, 100, "빨강", "빨강");
		// 점
		Drawable d02 = new Point(2, 2);
		// 삼각형
		Drawable d03 = new Triangle(50, 100, "파랑", "검정");
		// 원
		Drawable d04 = new Circle(20, "노랑", "검정");

		Drawable[] dArray = new Drawable[4];

		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;
		
      
		
		for (int i = 0; i < dArray.length; i++) {
				dArray[i].draw();			
		}
		
		

		// 사각형의 가로값

		System.out.println(((Ractangle) dArray[0]).getWidth());

		// 원의 넓이

		System.out.println(((Circle) dArray[3]).area());
		System.out.println(((Shape) dArray[3]).area());

		// 점의 x값

		System.out.println(((Point) dArray[1]).getX());

		
		
		// 전체에서 도형의 넓이를 출력
		// area 를 출력하는데 Drawable 중 Shape 이면 출력

		System.out.println("--------------------------------------------------------");

		for (int i = 0; i < dArray.length; i++) {
			if (dArray[i] instanceof Shape) {
				// 현재 배열의 주소를 따라가면 Shape 이 존재하는지 물어보는 문법 instanceof
				System.out.println(((Shape)dArray[i]).area());
				
			}
		}

	}

}
