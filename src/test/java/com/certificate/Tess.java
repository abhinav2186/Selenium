package com.certificate;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tess extends Sum {

	@DataProvider(name="abhinav")
	public static Object[][] dp() 
		{

		Object[][] a =
			{
					{10,90},
					{20,70}	
			};
		return a;

	}
	
	
	
	@Test(dataProvider="abhinav")	
	public static void sum(int a, int b)
	{
	   	s= a+b;
	   	System.out.println(s);
	}
		
		
	

}
