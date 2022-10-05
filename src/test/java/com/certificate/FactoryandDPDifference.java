package com.certificate;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactoryandDPDifference {

	String Username;
	String Password;
	
	@DataProvider(name = "abhi")
	public static Object[][] dp()
	{
		
	 Object[][] a=  
				{
						{"raj","raj@123"},{"lal","lal@123"}
			             
				};
	 return a;
		
	}
	
	
	
	@Test(dataProvider="abhi")
	public void login(Object a, Object b)
	{
		System.out.println("Username is "+a+" Password is "+b);
	}
	
}
