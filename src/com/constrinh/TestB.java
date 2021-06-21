package com.constrinh;
class TestA {

public void start() 

 { 

System.out.println("TestA"); }

 }
public class TestB extends TestA {
	public void start()

	{ 

	System.out.println("TestB");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA  t=new TestB();

		t.start();
	}

}
