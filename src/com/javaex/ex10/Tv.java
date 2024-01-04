package com.javaex.ex10;

public class Tv {
	
	// 필드
	
	private int channel;
	private int volume;
	private boolean power;
	
	
	// 생성자
	
	public Tv() {
		
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
	
	// 메소드 - g/s   
	// read- only : getter만 작성
	
	public boolean power(boolean power) {
		if(power==true) {
			this.power=true;
		} else {
			this.power=false;
		}
		return power;
	}

	
	
	public void getChannel(int channel) {
		
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		} else if (channel<1) {
			this.channel = 1;
		} else {
			this.channel = 0;
		}
		
	}
	
	public void getChannel(boolean channel) {
		if(channel==true) {
			this.channel = +1 ;
		}
	}
		

	public int getVolume() {
		return volume;
	}

	// 메소드 - 일반
	
	public void status() {
		System.out.println("채널:" + channel + " 볼륨:" + volume + " TV:" + power);
	}

	
	
		
	
	


}
