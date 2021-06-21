package com.training;
interface Role
{
	public String getRoleName();
	public String getResponsibility();
}
class CEO implements Role
{
	public String getRoleName()
	{
		
		return "The CEO name is in Noida";
		
	}
	public String getResponsibility() {
		return "The responsibility of WFH";
	}
}
class Manager implements Role
{
	public String getRoleName()
	{
		
		return "The Manager Role is to Manages Everything";
		
	}
	public String getResponsibility() {
		return "The responsibility of Dealing with Clients ";
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role rp=new CEO();
		System.out.println(rp.getRoleName());
		System.out.println(rp.getResponsibility());
		Role rp1=new Manager();
		System.out.println(rp1.getRoleName());
		System.out.println(rp1.getResponsibility());

	}

}
