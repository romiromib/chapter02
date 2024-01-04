package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1  = new Song("좋은날","아이유","Real","이민수");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.showInfo();
		
		Song s2  = new Song("거짓말","BIGBANG","Always","G-DRAGON");
		s2.setYear(2007);
		s2.setTrack(2);
		s2.showInfo();
		
	}

}
