package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��������ת�������ǿ��ת��
		Animal c = new cat();
		cat c1 = (cat)c;
		
		//��������ת��
		dog d = new dog();
		Animal d1 = d;
		
		
		Animal s[] = {c,c1,d,d1};
		
		for(int i=0;i<s.length;i++){
			Animal x = s[i];
			x.run();
		}

	}

}

interface Animal{
	public void run();
}

class cat implements Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cat run...");
	}
	
}

class dog implements Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run...");
	}
	
}