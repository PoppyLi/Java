package com.demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pan p = new Pan(3020);
		try {
			p.use();
		} catch (PanExp e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getP());
		}
	}

}

class PanExp extends Exception{
	int p;
	public PanExp(int p,String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.p = p;
	}
	
	public int getP(){
		return p;
	}
}

class Pan{
	int p;
	public Pan(int p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	public void use() throws PanExp{
		if(p > 500){
			throw new PanExp(p,"高压危险");
		}
		System.out.println("正常运行...");
	}
}