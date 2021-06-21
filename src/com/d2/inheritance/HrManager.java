package com.d2.inheritance;

class HrManager extends Manager {
	public HrManager(int employeeid, String name, String email, String phoneNumber, String designation, double incentive) {
		super(employeeid, name, email, phoneNumber, designation);
		this.incentive=incentive;
		// TODO Auto-generated constructor stub
	}

	double incentive;
	public void printDetails()
	{
		System.out.println("...Employeee Details....");
		System.out.println("Eid "+employeeid+"\nName "+name+"\nIncentive "+incentive+"\nPhone Number "+phoneNumber);
	}
	
	

}
