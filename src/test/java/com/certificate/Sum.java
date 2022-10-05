package com.certificate;

import org.testng.annotations.Test;

public class Sum {

	static int s=0;
	
	public static void sum(int a, int b)
	{
	   	s= a+b;
	   	System.out.println(s);
	}
	

	
	
	public static void main(String args[])
	{
		sum(10,20);
		
		
	}
	
	
	
}
