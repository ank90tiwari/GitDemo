package com.d3.ExceptionDemo;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("abc.txt");
	}

}
