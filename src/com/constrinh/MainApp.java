package com.constrinh;
class A

{

A() { }

}
class B extends A { 

B(String b) 

{

System.out.println("default Constructor");

System.out.println(b);

}

}
class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B("class");	
	}

}
