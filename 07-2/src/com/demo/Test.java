package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b = false;
		Collection<String> c1 = new ArrayList<String>();
		
		c1.add("A");
		
		Collection<String> c2 = new ArrayList<String>();
		
		c2.add("A1");
		c2.add("B2");		
		c1.addAll(c2);
		b = c1.isEmpty();
		b = c1.equals(c2);
		
		System.out.println(b);
		
		Iterator<String> it = c2.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
