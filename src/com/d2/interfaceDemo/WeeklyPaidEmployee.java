package com.d2.interfaceDemo;

class WeeklyPaidEmployee implements ISalary {
	String firstname;
	double wagesPerWeek;
	
	
	
	
	public WeeklyPaidEmployee(String firstname, double wagesPerWeek) {
		super();
		this.firstname = firstname;
		this.wagesPerWeek = wagesPerWeek;
	}


	@Override
	public void CalculateSalary(int wdays) {
		wagesPerWeek=500*wdays;
		
	}


	@Override
	public String toString() {
		return "WeeklyPaidEmployee [firstname=" + firstname + ", wagesPerWeek=" + wagesPerWeek + "]";
	}


	
}
