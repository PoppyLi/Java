package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */	
	static List<String> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list = new ArrayList<String>() ;
		
		add("A");
		add("B");
		add("C");
		add("D");
		
		iterator();
		
		find("A");
		
		remove("C");
		
		
		iterator();
	}
	
	
	static void add(String e){
		list.add(e);
	}
	
	static void remove(String e){
		list.remove(e);
	}

	static void find(String e){
		boolean b = false;
		for(String s:list){
			if(s.equals(e)){
				System.out.println("found!");
				b = true;
				return;
			}
		}
		if(!b){
			System.out.println("not found!");
		}
	}
	
	static void iterator(){
		for(String s:list){
			System.out.println(s);
		}
	}
	
}
