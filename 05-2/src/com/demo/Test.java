package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c = new cat();
		dog d = new dog();
		person p = new person();
		
		p.care(c);
		p.care(d);
	}

}

class person{
	public void care(pet p){
		p.run();
	}
}

interface pet{
	public void run();
}

class dog implements pet{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run...");
	}
}

class cat implements pet{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cat run...");
	}
}
