package com.demo;

import java.io.File;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 */
	static String file1 = "C://java//a.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6();
	}
	
	static void test7(){
		File f = new File("C://");
		File fstr[] = f.listFiles();
		for(File fa:fstr){
			System.out.println(fa);
		}
	}
	
	static void test6(){
		File f = new File("C://java//c.txt");
		File f1 = new File("C://java//a.txt");
		boolean b = f.renameTo(f1);
		System.out.println(b);
	}
	
	static void test5(){
		File f = new File(file1);
		String fname = f.getName();
		String fpath = f.getAbsolutePath();
		String fparent = f.getParent();
		System.out.println(fname);
		System.out.println(fpath);
		System.out.println(fparent);
	}
	
	static void test4(){
		File d = new File(file1);
		boolean b = d.delete();
		System.out.println(b);
	}
	
	static void test3(){
		File d = new File("C://java//aa//bb//cc");
		boolean b = d.mkdirs();
		System.out.println(b);
	}

	static void test2(){
		File f = new File(file1);
		try {
			boolean b = f.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void test1(){
		File f = new File(file1);
		boolean b = f.exists();
		System.out.println(b);
	}
}
