package com.d2.OverrideDemo;

public class Employee {
	int eid;
	String name;
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	public String PrintDetails() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	

}
