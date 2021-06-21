package com.d3.ExceptionDemo;


public class CallStackDemo {

	public static void method2() {
		System.out.println("Inside Method2");
	
	}
	public static void method1() {
		System.out.println("Inside Method1");
		method2();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		method1();
		System.out.println("Back in main");
		

	}

}
