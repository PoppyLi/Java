package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		System.out.println("hello...");
	}
	
	static void test1(){
		try {
			String str = "aaaaaa";
			int len = str.length();
			System.out.println(len);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	static void test2() {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,3};
			int b = a[11];
			System.out.println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	static void test3() {
		// TODO Auto-generated method stub
		try {
			Class.forName("Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
