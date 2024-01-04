package com.javaex.ex08;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song(){
		
	}
	
	public Song(String title,String artist,String album,String composer){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		
	}
	

	
	//메소드-gs
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	

	//매소드-일반
	
	public void showInfo() {
		System.out.println(artist+","+title+"("+album+","+year+","+track+"번 track,"+composer+"작곡 )");
	}
	
}
