package com.demo;

public class Test {
	public static void main(String[] args) {
		Person per = new Person(1,"tom");
		String str = per.toString();
		System.out.println(str);
		
		Person per2 = new Person(1,"tom");
		System.out.println(per==per2);
		boolean r = per.equals(per2);
		System.out.println(r);
		
		per = null;
		per2 = null;
		
		System.gc();
	}
}

class Person{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid+","+name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person per = (Person)obj;
		return (this.pid == per.pid) && this.name.equals(per.name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize……");
	}
	
	//私有的属性，公共的方法
	private int pid;
	private String name;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		if(pid<0){
			this.pid = 0;
		}
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


