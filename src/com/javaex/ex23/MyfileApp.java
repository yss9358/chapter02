package com.javaex.ex23;

public class MyfileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myfile mf = new Myfile();

		/*
		
		String str = mf.read("c:/aaa.txt");
		System.out.println(str);
		
		// 파일이 정상적일때

		*/
		
		/*
		
		//예외처리가 잘 되었으나 처리방식이 원하는게 아님
		String str = mf.read2("c:/bbb.txt");
		System.out.println(str);
		
		*/
		
		try {
			 mf.read3("c:/ccc.txt");
		} catch (Exception e) {
			System.out.println("cannot find file");
		}
		
		
	}

}
