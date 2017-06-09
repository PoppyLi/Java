package com.demo;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}
	
	static void test1(){
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("1", "Tom");
		hm.put("2", "Rose");
		hm.put("3", "Kite");
		
		String val = hm.get("3");
		
		Set<String> keys = hm.keySet();
		for(String key : keys){
			val = hm.get(key);
			System.out.println(key+":"+val);
		}
		
//		System.out.println(val);
//		System.out.println(hm);
	}
	
	static void test2(){
		TreeMap<String,String> tm = new TreeMap<String, String>();
		tm.put("1", "Tom");
		tm.put("2", "Rose");
		tm.put("3", "Kite");
		
		Set<String> keys = tm.keySet();
		for(String key : keys){
			String val = tm.get(key);
			System.out.println(key+":"+val);
		}
		System.out.println(tm);
	}

}
