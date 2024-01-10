package com.javaex.ex22;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		try {
			for (int i=0; i<intArray.length; i++) {
				System.out.println(intArray[i]);
			}
			
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
			
			System.out.println("배열의 범위를 벗어나 강제 종료합니다.");
		} finally {
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		

	}

}
