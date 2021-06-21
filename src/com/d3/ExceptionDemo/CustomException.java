package com.d3.ExceptionDemo;

class MinSalary extends RuntimeException
{
	String msg;
	MinSalary(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "MinSalary [msg=" + msg + "]";
	}
}

class CustomException {

	public static void main(String[] args) {
		System.out.println("Enter salary");
		try {
		int salary=new java.util.Scanner(System.in).nextInt();
		if(salary<1000)
		{
			throw new MinSalary("Salary cannot be less than 100");
		}
		else
			System.out.println("Salary: "+salary);
		}catch(MinSalary ms)
		{
			System.out.println(ms);
		}

	

	}

}
