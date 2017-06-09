package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testArrayList();
		
		testLinkedList();
	}

	
	static void testArrayList(){
		ArrayList<String> al = new ArrayList<String>();
		al.add(0, "A1");
		al.add("A");
		al.add("B");
		al.add("C");
		
		String b = al.get(2);
		int c = al.indexOf("C");
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(al);
	}
	
	static void testLinkedList(){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		ll.addFirst("A0");
		ll.addLast("D");
		
		System.out.println(ll.getFirst());		
		System.out.println(ll.getLast());	
		
		System.out.println(ll);
	}
}
