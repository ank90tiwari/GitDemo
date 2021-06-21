package com.d2.polymorphismdemo;

class Employee {
	int eid;
	String name;
	double Salary;
	
	public Employee() {
		super();
	}
	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		Salary = salary;
	}
	
	

}
