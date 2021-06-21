package com.d2.inheritance;

class RegularEmployee extends Employee {
	double salary;

	public RegularEmployee(int employeeid, String name, String email, String phoneNumber, double salary) {
		super(employeeid, name, email, phoneNumber);
		this.salary = salary;
	}
	public void printDetails()
	{
		System.out.println("...Employeee Details....");
		System.out.println("Eid "+employeeid+"\nName "+name+"\nSalary "+salary+"\nPhone Number "+phoneNumber);
	}
	
}
