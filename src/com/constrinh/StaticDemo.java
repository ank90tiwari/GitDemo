package com.constrinh;

class StaticDemo {
	public StaticDemo() {

		System.out.println("Default constructor");

		}static {

System.out.println("Static block1");   

}



static {

System.out.println("Static block2");   

}
	public static void main(String[] args) {
		new StaticDemo();	
		
	}

}
