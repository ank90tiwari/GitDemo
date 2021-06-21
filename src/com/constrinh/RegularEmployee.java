package com.constrinh;

class RegularEmployee extends Employee {
	int hrworked;
	double salary;
	
	RegularEmployee(int eid,String name,int hrworked,double salary)
	{
		super(hrworked, name);
		this.employeeid=eid;
		this.name=name;
		this.hrworked=hrworked;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [hrworked=" + hrworked + ", salary=" + salary + ", employeeid=" + employeeid + ", name="
				+ name + "]";
	}
	
}
