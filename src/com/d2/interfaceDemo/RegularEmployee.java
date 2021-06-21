package com.d2.interfaceDemo;

class RegularEmployee implements ISalary {
	String firstname;
	double salary;
	
	
	
	
	public RegularEmployee(String firstname, double salary) {
		super();
		this.firstname = firstname;
		this.salary = salary;
	}


	@Override
	public void CalculateSalary(int wdays) {
		int medicalAllowance=10000;
		salary=1000*wdays*medicalAllowance;
		
	}


	@Override
	public String toString() {
		return "RegularEmployee [firstname=" + firstname + ", salary=" + salary + "]";
	}
	

}
