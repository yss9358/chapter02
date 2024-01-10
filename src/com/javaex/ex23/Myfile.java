package com.javaex.ex23;

import java.io.IOException;

public class Myfile {
	
	// 필드   생략가능
	
	// 생성자  기본생성자
	
	// 메소드 g/s  필드가없어서 x
	
	// 메소드 일반
	
	// 파일이 있어서 정상적으로 실행되는 경우
	public String read(String path) {
		
		String result = "학교종이 땡땡땡 어서 모이자" ; // path에 파일이 있어 사용하는 경우 가정
		
		return result;
	}
	
	// 파일이 없는 경우 - 만드는 쪽에서 처리하는 경우

	public String read2(String path) {
		
		String result = " " ; // path에 파일이 없는 경우 가정
		
		//파일이 없는 경우를 강제로 발생 시키는 코드 
		
		try {
			throw new IOException();
			
		} catch (IOException e) {
			System.out.println("경로에 파일이 없습니다");
		}
	
		return result;
	}
	
	// 파일이 없는 경우 - 만드는 쪽에서 처리하지 않고, 사용하는 쪽에 알려주는 경우
	public void read3(String path) throws IOException {
		String result = "";
		//path에 있는 파일이 없음을 가정
		
		throw new IOException();
		// 파일이 없는상황을 강제로 발생
		
	}

}
