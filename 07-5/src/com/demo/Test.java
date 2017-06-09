package com.demo;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test4();
	}
	
	static void test4(){
		//传递自定义参数类型是要对进行compareTo接口继承。String是自己定义好的
		TreeSet<Person> ts = new TreeSet<Person>();
		Person per1 = new Person(1,"Tom",20);
		Person per2 = new Person(2,"rose",19);
		Person per3 = new Person(1,"kite",21);
		
		ts.add(per1);
		ts.add(per2);
		ts.add(per3);
		
		System.out.println(ts);
	}
	
	static void test3(){
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("E");
		ts.add("C");
		ts.add("A");
		ts.add("D");
		ts.add("B");
		
//		System.out.println(ts.first());
		
		System.out.println(ts);
	}
	
	static void test2(){
		HashSet<Person> hs = new HashSet<Person>();
		Person per1 = new Person(1,"Tom",20);
		Person per2 = new Person(2,"Tom",20);
		
		hs.add(per1);
		hs.add(per2);
		
		System.out.println(hs);
	}
	
	
	static void test1(){
		HashSet<String> hs =new HashSet<String>();
		
		hs.add("A");
		hs.add("A");
		hs.add("B");
		
		System.out.println(hs);
	}
}

class Person implements Comparable{
	private int id;
	private String name;
	private int age;
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name+","+age;
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person per = (Person)o;		
		
		//返回-1为第一个比第二个大，0相等
		return this.age<per.age?-1:(this.age==per.age?0:1);
	}
	
	
}