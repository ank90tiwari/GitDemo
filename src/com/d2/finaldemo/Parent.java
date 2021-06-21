package com.d2.finaldemo;

class Parent {
	final public void display1()
	{
		System.out.println("Hello World");
	}
	public void display2()
	{
		System.out.println("Hello from Parent Class");
	}

}
class Child extends Parent
{
	
	public void display2()
	{
		System.out.println("Hello from Child Class");
	}
}
