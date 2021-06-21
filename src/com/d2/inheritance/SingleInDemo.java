package com.d2.inheritance;

class SingleInDemo {
	public static void main(String args[]) {
		RegularEmployee ob=new RegularEmployee(101, "James", "James@gmail.com", "Ghazipur", 100);
		ob.printDetails();
		WeeklyPaidEmployee wpe=new WeeklyPaidEmployee(102, "Neela", "Neela@gmail.com", "131113",788767);
		wpe.printDetails();
	}

}
