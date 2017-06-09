package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

final class FinalClass{
	
}

/*class SubClass extends FinalClass{
	final  class 阻止继承
}*/

class A{
	final void m(){
		
	}
	final double Pi = 3.14;
	void test(){
		//Pi = 3.1415926;常量不能被重写
	}
}

class A1 extends A{
/*	void m(){
		final 方法是阻止重写/覆盖
	}*/
}