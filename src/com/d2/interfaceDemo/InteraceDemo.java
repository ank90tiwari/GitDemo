package com.d2.interfaceDemo;

class InteraceDemo {

	public static void main(String[] args) {
		ISalary ob=new RegularEmployee("XYZ",45);
		ob.CalculateSalary(30);
		System.out.println(ob);
		
		ISalary ob1=new WeeklyPaidEmployee("pERON",857);
		ob1.CalculateSalary(30);
		System.out.println(ob1);
		

	}

}
