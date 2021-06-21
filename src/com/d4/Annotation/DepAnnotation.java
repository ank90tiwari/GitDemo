package com.d4.Annotation;
class Bank
{
	@Deprecated
	double compundInterest(float amount,int years)
	{
		//dont use this for future as it is deprecated
		return (amount*6.0*years/100);
	}
	public double compundInterest(float amount,float rateOfint,int years)
	{
		//use this for future app development
		return (amount*rateOfint*years/100);
	}
}
class DepAnnotation {

	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.compundInterest(12000, 2));

	}

}
