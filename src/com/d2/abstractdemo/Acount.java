package com.d2.abstractdemo;

abstract class Acount {
	public void interestRate() {
		System.out.println("Interset Rate is 6");
	}
	public abstract void depositLimit();
	public abstract void WithdrawalLimit();
}
class CurrentAccount extends Acount
{
	public void depositLimit() {
		System.out.println("Dept Limit=10000");
	}
	public void WithdrawalLimit() {
		System.out.println("Wih Limit=50000");
	}
}
class SavingAccount extends Acount
{
	public void depositLimit() {
		System.out.println("Dept Limit=100000000");
	}
	public void WithdrawalLimit() {
		System.out.println("Wih Limit=500000000");
	}
}

