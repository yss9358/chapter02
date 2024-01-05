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
	
	public boolean power(boolean power) { // true == power on // false == power off
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
			this.channel = 255;
		}
		
	}
	
	public void getChannel(boolean channel) { // true == channel+1 // false == channel -1
		if(this.channel>=2 && this.channel<=254) {
			if(channel==true) {
				this.channel = this.channel + 1;
			} else {
				this.channel = this.channel -1;
			}	
		} if(this.channel<=1) {
			if (channel==true) {
				this.channel = this.channel + 1;
			} else {
				this.channel = 1;
			}
		} if(this.channel>254) {
			if (channel==false) {
				this.channel = this.channel - 1;
			} else {
				this.channel = 255;
			}
		}
		
	}
	
	public void getVolume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume = volume;
		} else if (volume<0) {
			this.volume = 0;
		} else {
			this.volume = 100;
		}
	}
	
	public void getVolume(boolean volume) {
		if(this.volume>=1 && this.volume<=99) {
			if(volume==true) {
				this.volume = this.volume + 1;
			} else {
				this.volume = this.volume - 1;
			}
		} if(this.volume<1) {
			if(volume==true) {
				this.volume = this.volume + 1;
			} else {
				this.volume = 0;
			}
			
		} if (this.volume>99) {
			if (volume==false) {
				this.volume = this.channel - 1;
			} else {
				this.volume = 100;
			}
		}
	}

	// 메소드 - 일반
	
	public void status() {
		System.out.println("채널:" + channel + " 볼륨:" + volume + " TV:" + power);
	}

}
