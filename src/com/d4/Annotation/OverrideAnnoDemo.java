package com.d4.Annotation;
class Employee
{
	void displayInfo(int eid)
	{
		System.out.println("Information about Employee");
			
	}
	
}
class Manager extends Employee
{
	@Override
	void displayInfo(int eid)
	{
		System.out.println("Information about Manager");
	}
}
class OverrideAnnoDemo {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.displayInfo(232);
		

	}

}
