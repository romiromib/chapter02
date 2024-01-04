package com.javaex.ex10;

public class Tv {
//필드
	private int channel;
	private int volume;
	private boolean power;
//생성자

	public Tv() {
		
	}
	
	public Tv(int channel, int volume, boolean power ) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
//메소드-gs
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	
//메소드-일반

	public void status() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
	
	public void power(boolean on) {
		if(on==true) {
			this.power = true;
		}
		else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if(channel>=255) {
			this.channel= 255;
		}
		else if(channel<=0){
			this.channel= 1;
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {
			this.channel= channel++;
			channel++;
		}
		else {
			this.channel= channel;
			channel--;
		}
	}
	
	
	public void volume(int volume) {
		if(volume>100) {
			this.volume= 100;
		}
		else if(volume<0){
			this.volume= 0;
		}
	}
	
	public void volume(boolean up) {
		if(up==true) {
			this.volume = volume;
			volume++;
		}
		else {
			this.volume = volume;
			volume--;
		}
	}

	
	
}
