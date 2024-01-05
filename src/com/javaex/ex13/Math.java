package com.javaex.ex13;

public class Math {
	
	//필드
	public static double pi = 3.14; 
	// static 메소드에서 사용해야할 변수는 미리 필드에 올려놔야한다 ( 고정값일때)
	
	
	
	//생성자 - default 생성자 사용
			
	//메소드 - g/s
	
	//메소드 - 일반
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus (double a, int b) {
		return a+b;
	}
	
	public static double plus (int a, double b) {
		return a+b;
	}
	
	public static double plus (double a, double b) {
		return a+b;
	}
	
	public static double circleArea (int radius) {
		
		return pi*radius*radius;
	}
}
