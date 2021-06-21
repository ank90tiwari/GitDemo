package com.d2.abstractdemo;

class UseAccount {

	public static void main(String[] args) {
		Acount acc=new CurrentAccount();
		acc.depositLimit();
		acc.WithdrawalLimit();
		
		Acount acc1=new SavingAccount();
		acc1.depositLimit();
		acc1.WithdrawalLimit();
	}

}
