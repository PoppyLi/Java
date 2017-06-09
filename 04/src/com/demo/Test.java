package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c = new Computer();
		c.read();
		c.write();
		
		
		Mobile m = new Mobile();
		m.read();
		m.write();
		m.play();
		
		
		Device d = new Device();
		d.read();
		d.write();
		d.play();
	}
}