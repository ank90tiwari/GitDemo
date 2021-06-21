package com.d3.ExceptionDemo;
import java.util.Scanner;
class HandlingExDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter 1 number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2 number:");
		int n2=sc.nextInt();
		System.out.println("Div of number 1 and number 2 : "+(n1/n2));
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exceptional Handling Demo");
			System.out.println("End of main");
		}

	}

}
