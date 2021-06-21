package com.d3.ObjectMethodDemo;

import java.lang.reflect.Method;

import com.sun.jdi.Field;

class Student
{
	int eid;
	String name;
	double salary;
	
	void setDetails(int eid,String name,double salary) {
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void getDetails() {
		System.out.println("eid"+eid+"Name:"+name+"salary"+salary);
	}
}
class ClassDemo {

	public static void main(String[] args) {
		Student st=new Student();
		
		Class myclass=st.getClass();
		System.out.println(myclass.getName());
		Method [] methods=myclass.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}
		
		
		
	}

}
