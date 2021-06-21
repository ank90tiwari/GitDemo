package com.d2.polymorphismdemo;
class TestArgs
{
	public void Test () {
		System.out.println("Test without Args invoked");
	}
	public void Test (int a) {
		System.out.println("Test with (int)Args invoked");
	}
	
	
	public void Test(double i,int j)
	{
		System.out.println("Test with (double,int)Args invoked");
	}
}

class CompPolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArgs ob=new TestArgs();
		ob.Test();
		ob.Test(10);
		ob.Test(2, 4);

	}

}
