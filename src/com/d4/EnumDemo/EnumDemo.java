package com.d4.EnumDemo;
import java.util.*;
enum DOW
	{
		SUN("Sunday"),MON("Monday"),TUE("Tuesday"),WED("Wednesday"),THUR("Thursday"),
		FRI("Friday"),SAT("Saturday");
		private String msg;
	
		private DOW(String h) {
			this.msg=h;
		
		}
		public String getMsg()
		{
			return msg;
		}

	};

class EnumDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day of Week");
		String n=sc.next();
		DOW d=DOW.valueOf(n);
		switch(d)
		{
			case SUN:
			case MON:
			case TUE:
			case WED:
			case THUR:
			case FRI: 
				System.out.println(d.getMsg());
				break;
		}
	}

}
