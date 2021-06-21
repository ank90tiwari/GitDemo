package com.d3.ObjectMethodDemo;
class Employee implements Cloneable
{
	int eid;
	String name;
	double salary;
	
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	void setDetails(int eid,String name,double salary) {
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void getDetails() {
		System.out.println("eid: "+eid+"\nName: "+name+"\nsalary: "+salary);
	}
}
class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(101, "King", 345600);
		
		//Employee obj2=(Employee) obj.clone();
		
		obj.setDetails(102, "James", 900);
		obj.getDetails();
		
		
		

	}

}
