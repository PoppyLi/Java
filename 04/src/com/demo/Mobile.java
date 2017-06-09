package com.demo;

public class Mobile implements USB, MP3 {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("mobile Mp3 play...");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("moblie read...");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("mobile write...");
	}

}
