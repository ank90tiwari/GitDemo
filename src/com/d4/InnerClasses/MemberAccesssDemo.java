package com.d4.InnerClasses;
class Outer
{
	int i=100;
	static int j=90;
	
	public void message()
	{
		System.out.println("Hello from Outer");
	}
	
	class Inner
	{
		void display()
		{
			System.out.println("Outer i: "+i+"Outer j: "+j);
		}
	}
}
class MemberAccesssDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer(). new Inner().display();

	}

}
