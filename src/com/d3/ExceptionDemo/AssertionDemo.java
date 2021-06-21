package com.d3.ExceptionDemo;
import java.util.Scanner;
class AssertionDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter working hour betwen 0 and 40");
		int workingHour=new java.util.Scanner(System.in).nextInt();
		assert(workingHour>=0 && workingHour<=40):"Invalid Duration: "+workingHour;
				
		System.out.println("Value of workingHour is: "+workingHour);


	}

}
