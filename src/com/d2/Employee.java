package com.d2;

class Employee {
	int eid;
	String name;
	double salary;
	static String companyname="Infogain";
	
	static {
		System.out.println("Company Name");
		companyname=new java.util.Scanner(System.in).nextLine();
	}
	
	public static void chnangeCompany(String companyname)
	{
		Employee.companyname=companyname;
	}
	
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		
	}
	public void displayDetails() {
		System.out.println("Eid "+eid+"Name "+name+"Salary "+salary+"CompanyName "+companyname);;
	}
}
