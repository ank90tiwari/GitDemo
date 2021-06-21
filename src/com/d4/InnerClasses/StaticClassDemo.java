package com.d4.InnerClasses;

class OuterCls
{
	static class StaticNestedClass
	{
		public static void main(String[] args) {
			System.out.println("Main method of Static Nested Class");
		}
	}
	
	public static void main(String[] args) {
		OuterCls.StaticNestedClass on=new OuterCls.StaticNestedClass();
		on.main(args);
	}
}

class StaticClassDemo {

}
