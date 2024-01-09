package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 도형 (부모)
		Shape s01 = new Shape();
		
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		
		System.out.println(s01.toString());
		
		Ractangle[] rArray = new Ractangle[2];
		
		
		
		
		// 사각형(자식)
		Ractangle r01 = new Ractangle();
		
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		
		System.out.println(r01.toString());
		
		Ractangle r02 = new Ractangle(40,40,"파랑","검정");
		
		System.out.println(r02.toString());
		
		// 삼각형(자식)
		
		Triangle t01 = new Triangle();
		
		t01.setWidth(5);
		t01.setHeight(10);
		t01.setFillColor("빨강");
		t01.setLineColor("검정");
		
		System.out.println(t01.toString());
		
		Triangle t02 = new Triangle(10,10,"파랑","검정");
		
		System.out.println(t02.toString());
		
		// 원(자식)
		
		Circle c01 = new Circle();
		
		c01.setRadius(5);
		c01.setFillColor("노랑");
		c01.setLineColor("검정");
		
		System.out.println(c01.toString());
		
		Circle c02 = new Circle(10,"파랑","검정");
		
		System.out.println(c02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for (int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		

	}

}
