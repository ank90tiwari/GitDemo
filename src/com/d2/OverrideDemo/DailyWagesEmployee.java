package com.d2.OverrideDemo;

public class DailyWagesEmployee extends Employee {
	
	double dailywages;

	public DailyWagesEmployee(int eid, String name, double dailywages) {
		super(eid, name);
		this.dailywages = dailywages;
	}

	@Override
	public String toString() {
		return "DailyWagesEmployee [dailywages=" + dailywages + ", eid=" + eid + ", name=" + name + "]";
	}
	
	
	

}
