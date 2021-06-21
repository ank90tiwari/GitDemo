package com.d3.WrapperClass;

class WrapperClassDemo {

	public static void main(String[] args) {
		int i=100;
		
		Integer iop=new Integer(i);
		System.out.println(iop.byteValue());
		
		i=iop.intValue();
		
		

	}

}
