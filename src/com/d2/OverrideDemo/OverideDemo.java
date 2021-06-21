package com.d2.OverrideDemo;

class OverideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularEmployee remp=new RegularEmployee(101, "Blanke", 4500.7, 15000.8);
		System.out.println(remp.PrintDetails());
		
		Employee emp=new RegularEmployee(101,"Jack", 132, 7968);
		System.out.println(emp.PrintDetails());
		
		Employee emp1=new DailyWagesEmployee(120, "Smith", 600);
		System.out.println(emp1.PrintDetails());
	}

}
