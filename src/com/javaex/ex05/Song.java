package com.javaex.ex05;

public class Song {
	
	private String title; // 제목
	private String artist; // 가수 이름
	private String album; // 앨범 이름 
	private String composer; // 작곡가 이름
	private int year; // 연도 
	private int track; // 앨범의 트랙번호 숫자로 받음 (ex 1,2,3)
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;		
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void draw() {
		
		System.out.println( artist +", "+ title + " ( " + album + ", " + year + ", " + track + "번 track" + ", " + composer + " 작곡" + " )");
		
	}
	
	
	
	

}
