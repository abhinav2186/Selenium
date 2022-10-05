package com.parallel;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestClass1 {


	@Test
	public void testMethod1()
	{
		System.out.println("Inside test method 1 "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("Inside test method 2 "+Thread.currentThread().getId());
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3()
	{
		System.out.println("Inside test method 3 "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void testMethod4()
	{
		System.out.println("Inside test method 4 "+Thread.currentThread().getId());
	}
	
	
}
