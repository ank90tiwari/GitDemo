package com.d3.ExceptionDemo;

public class Exdemo3 {

	public static void main(String[] args) {
		String salary=args[0];
		try {
		int sal=Integer.parseInt(salary);
		System.out.println("Salary is: "+salary);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
