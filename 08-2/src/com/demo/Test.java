package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4();
	}
	
	static void test1(){
		try {
			FileOutputStream out = new FileOutputStream("src\\a.txt");
			String str = "Hello World!";
			byte b[] = str.getBytes();
			out.write(b);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	static void test2(){
		try {
			FileInputStream in = new FileInputStream("src\\a.txt");
			int r;
			while((r=in.read()) != -1){
				System.out.print((char)r);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	
	static void test3(){
		try {
			FileWriter out = new FileWriter("src\\b.txt");
			out.write("Java»ù´¡Ñ§Ï°");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void test4(){
		try {
			FileReader in = new FileReader("src\\b.txt");
			int a;
			while((a=in.read())  != -1){
				System.out.print((char)a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
