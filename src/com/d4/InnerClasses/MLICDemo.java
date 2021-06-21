package com.d4.InnerClasses;

class Test
{
	public void calc()
	{
		class Add
		{
			int sum(int n1,int n2)
			{
				return n1+n2;
			}
		}
		Add o=new Add();
		System.out.println(o.sum(1, 2));
		System.out.println(o.sum(11, 22));
	}
}


class MLICDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.calc();

	}

}
