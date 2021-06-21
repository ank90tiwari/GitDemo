package com.d2.inheritance;

class WeeklyPaidEmployee extends Employee {
	double wages;
	public WeeklyPaidEmployee(int employeeid, String name, String email, String phoneNumber, double wages) {
		super(employeeid, name, email, phoneNumber);
		this.wages=wages;
		// TODO Auto-generated constructor stub
	}
	public void printDetails()
	{
		System.out.println("...Employeee Details....");
		System.out.println("Eid "+employeeid+"\nName "+name+"\nWages "+wages+"\nPhone Number "+phoneNumber);
	}
	
	

}
