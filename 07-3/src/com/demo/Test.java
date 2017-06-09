package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		
		Iterator<String> it = list.iterator();
		
//		while(it.hasNext()){
//			System.out.println(it.next());		
//		}
		
		it.hasNext();
		System.out.println(it.next());
		it.hasNext();
		System.out.println(it.next());
		it.hasNext();
		System.out.println(it.next());
		
		it.remove();

		System.out.println(list);
	}

}
