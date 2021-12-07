package com.browser_launch;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A p=new Pojo_A();
		p.setA(20);
		
		int a = p.getA();
		
		p.setA(45);
		int a2 = p.getA();
		System.out.println("Value " +a +a2);
		
		
	}

}
