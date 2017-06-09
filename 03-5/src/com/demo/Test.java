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

//继续后要实现抽象方法
class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run……");
	}	
}

//要不本身也是抽象类
abstract class Cat extends Animal{
	
}