package com.toStringDemo;

class Employee {
	int employeeid;
	String name;
	String email;
	String phoneNumber;
	public Employee(int employeeid, String name, String email, String phoneNumber) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	

}
