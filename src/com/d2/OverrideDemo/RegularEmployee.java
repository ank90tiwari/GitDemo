package com.d2.OverrideDemo;

class RegularEmployee extends Employee {
	double salary;
	double bonus;
	
	public RegularEmployee(int eid, String name, double salary, double bonus) {
		super(eid, name);
			
		this.salary=salary;
		this.bonus=bonus;
	}

	
	public String PrintDetails() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + ", eid=" + eid + ", name=" + name + "]";
	}
	
	

	

}
