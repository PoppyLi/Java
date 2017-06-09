package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String str = null;
			int len = str.length();
			int s[] = {1,2,3};
			int x = s[5];
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		} finally{
			System.out.println("finally...");
		}		
	}
}
