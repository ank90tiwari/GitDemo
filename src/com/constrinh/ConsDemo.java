package com.constrinh;
class GP
{
	GP()
	{
		System.out.println("Grand Parent Class Constructors Invoked");
	}
}
class Parent extends GP
{
	Parent()
	{
		System.out.println("Parent Class Constructors Invoked");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Child Class Constructors Invoked");
	}
}
public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p=new Parent();
		Child c=new Child();
		
		

	}

}
