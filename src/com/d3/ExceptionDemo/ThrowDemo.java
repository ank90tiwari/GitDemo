package com.d3.ExceptionDemo;
import java.util.*;
class ThrowDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter age");
		int age=new java.util.Scanner(System.in).nextInt();
		if(age<18)
		{
			throw new Exception("Age limit must be 20 and 45");
		}else
			System.out.println("Everything Fine");
		
		

	}

}
