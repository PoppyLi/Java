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
	final  class ��ֹ�̳�
}*/

class A{
	final void m(){
		
	}
	final double Pi = 3.14;
	void test(){
		//Pi = 3.1415926;�������ܱ���д
	}
}

class A1 extends A{
/*	void m(){
		final ��������ֹ��д/����
	}*/
}