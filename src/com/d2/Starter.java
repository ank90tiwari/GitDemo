package com.d2;

class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1=new Employee(101, "James", 4000);
		Employee ob2=new Employee(102, "Mith", 4300);
		ob1.displayDetails();
		ob2.displayDetails();
		
		Employee.chnangeCompany("Gogggle");
		ob1.displayDetails();
		ob2.displayDetails();
		
	}

}
