package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */	
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.add(2);
		list.add(9);
		list.add(3);
		list.add(8);
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(6);
		list.add(1);
		
		System.out.println(list);
		Collections.sort(list);		
//		Collections.shuffle(list);
//		Collections.reverse(list);
		int l = Collections.binarySearch(list, 3);
		System.out.println(l);
		System.out.println(list);
		
		
		
	}

}
