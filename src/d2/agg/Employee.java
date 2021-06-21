package d2.agg;

class Employee {
	int eid;
	String name;
	Department department;
	public Employee(int eid, String name, Department department) {
		super();
		this.eid = eid;
		this.name = name;
		this.department = department;
	}
	public void display()
	{
		System.out.println("Eid:"+eid+"name"+name+"department"+department.deptDetails());
	}

}
