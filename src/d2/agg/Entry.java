package d2.agg;

class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept=new Department(10, "IT", "Noida");
		Employee emp=new Employee(101, "CSE", dept);
		//dept.deptDetails();
		emp.display();
		
		Department dob=new Department(20, "HR", "Delhi");
		String details=dob.deptDetails();
		System.out.println(" ........");
		System.out.println(details);
	}

}
