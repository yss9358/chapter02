package com.javaex.ex05;

public class Song {
	
	private String title; // 제목
	private String artist; // 가수 이름
	private String album; // 앨범 이름 
	private String composer; // 작곡가 이름
	private int year; // 연도 
	private int track; // 앨범의 트랙번호 숫자로 받음 (ex 1,2,3)
	
	// 필드를 작성한 뒤  alt + shift + s ( source 창 ) 에서 generate getters and setters선택
	// 원하는 필드를 선택한뒤 public 으로 완성시킬 수 있다.
	// ctrl + shift + f 로 기본값 자동정렬을 할 수 있다.
	
	
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
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() { // alt + shift + s  에서 toString 선택 , 필드가 잘 저장된 상태인지 확인하기 위해 만듦
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void draw() {
		
		System.out.println( artist +", "+ title + " ( " + album + ", " + year + ", " + track + "번 track" + ", " + composer + " 작곡" + " )");
		
	}
	
	
	
	

}
