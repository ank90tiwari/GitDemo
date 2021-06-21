package com.d4.Annotation;
import java.util.ArrayList;

class BankCls
{
	@SuppressWarnings("all")
	public ArrayList custInfo()
	{
		ArrayList custList=new ArrayList();
		custList.add("James");
		custList.add("Smith");
		custList.add("Lex");
		custList.add("Kane");
		return custList;
	}
}

class SupressWarningDemo {

	public static void main(String[] args) {
		BankCls b=new BankCls();
		System.out.println(b.custInfo());
		
	}

}
