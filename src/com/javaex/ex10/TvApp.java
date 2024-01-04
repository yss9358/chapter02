package com.javaex.ex10;

public class TvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv(7,20,false);
		
		tv.status();
		
		tv.power(true);
		tv.status();
		tv.getChannel(9);
		tv.status();
		tv.getChannel(25);
		tv.status();
		tv.getChannel(true);
		tv.status();
	}

}
