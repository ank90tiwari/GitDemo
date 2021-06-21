package com.d2.inheritance;

class Manager extends Employee {
	public Manager(int employeeid, String name, String email, String phoneNumber, String designation) {
		super(employeeid, name, email, phoneNumber);
		this.designation=designation;
		// TODO Auto-generated constructor stub
	}

	String designation;
	
	public void printDetails()
	{
		System.out.println("...Employeee Details....");
		System.out.println("Eid "+employeeid+"\nName "+name+"\nDesignation "+designation+"\nPhone Number "+phoneNumber);
	}
	
	

}
