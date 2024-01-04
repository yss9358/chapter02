package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song s0 = new Song("아이유", "좋은날");
		System.out.println(s0);
		
		Song s1 = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수" );
		System.out.println(s1);
		System.out.println(s1.draw());
		
		Song s2 = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		
		System.out.println(s2.draw());
		
		Song s3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		
		System.out.println(s3.draw());
		
		
		
		
		

	}

}
