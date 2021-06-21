package com.d4.InnerClasses;

class OuterClass
{
	class InnerClass
	{
		public void msg() {
			System.out.println("Hello Ineer Class");
		}
	}
	
	public void OuterMessage()
	{
		InnerClass inner=new InnerClass();
		inner.msg();
		
	}
}
class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out=new OuterClass();
		OuterClass.InnerClass in=out.new InnerClass();
		in.msg();
		new OuterClass().new InnerClass().msg();
		
		out.OuterMessage();
		

	}

}
