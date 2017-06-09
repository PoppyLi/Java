package com.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
			FileOutputStream out = new FileOutputStream("src\\tmp1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			String str = "Hello World!";
			byte b[] = str.getBytes();
			bout.write(b);
			bout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void test2(){
		try {
			FileInputStream in = new FileInputStream("src\\tmp1.txt");
			BufferedInputStream bin = new BufferedInputStream(in);
			int r;
			while((r=bin.read()) != -1){
				System.out.print((char)r);
			}
			in.close();
			bin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void test3(){
		try {
			FileWriter wout = new FileWriter("src\\tmp2.txt");
			BufferedWriter bwout = new BufferedWriter(wout);
			bwout.write("Java»ù´¡Ñ§Ï°");
			bwout.close();
			wout.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void test4(){
		try {
			FileReader rin = new FileReader("src\\tmp2.txt");
			BufferedReader brin = new BufferedReader(rin);
			String bstr=null;
			while((bstr=brin.readLine()) != null){
				System.out.println(bstr);
			}
			rin.close();
			brin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
