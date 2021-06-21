package com.d3.ExceptionDemo;
class Employee
{
	void display() {
		System.out.println("Details of Employee");
	}
}

class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		try {
		emp=null;
		emp.display();
		}catch(Exception e)
		{
			System.out.println("NullPointerException");
		}
	}

}
