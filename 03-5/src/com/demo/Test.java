package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal a = new Animal();
		Dog dog = new Dog();
		dog.run();
	}
}


abstract class Animal{
	public abstract void run();
}

//������Ҫʵ�ֳ��󷽷�
class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run����");
	}	
}

//Ҫ������Ҳ�ǳ�����
abstract class Cat extends Animal{
	
}