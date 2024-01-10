package com.javaex.ex22;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		try { // 예외가 발생하지 않고 정상작동 했을 때
			double result  = 100/no;
			System.out.println(result);
		
		} catch(ArithmeticException e) {  // 예외 발생했을 때	
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다.");
			
		} finally {
			System.out.println("finaelly 영역");
		}
		
		System.out.println("프로그램 종료");
				
		sc.close();

	}

}
