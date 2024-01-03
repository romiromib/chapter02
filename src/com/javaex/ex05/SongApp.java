package com.javaex.ex05;

public class SongApp {

	public static void main(String[]args) {
		
		Song A = new Song();
		A.setTitle("좋은날");
		A.setArtist("아이유");
		A.setAlbum("Real");
		A.setComposer("이민수");
		A.setyYear(2010);
		A.setTrack(3);
		
		Song B = new Song();
		B.setTitle("거짓말");
		B.setArtist("BIGBANG");
		B.setAlbum("Always");
		B.setComposer("G-DRAGON");
		B.setyYear(2007);
		B.setTrack(2);
		
		Song C = new Song();
		C.setTitle("벚꽃엔딩");
		C.setArtist("버스커버스커");
		C.setAlbum("버스커버스커1집");
		C.setComposer("장범준");
		C.setyYear(2012);
		C.setTrack(4);
		
		A.showInfo();
		B.showInfo();
		C.showInfo();
		
		
	}
	
}
