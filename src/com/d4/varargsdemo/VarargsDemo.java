package com.d4.varargsdemo;

class VarargsDemo {
	static public void add(int n1,int n2,int ... vararg)
	{
		
		for(int num:vararg)
		{
			System.out.print(num +" ");
			
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		VarargsDemo vg=new VarargsDemo();
		
		VarargsDemo.add(2,3,4);
		

	}

}
