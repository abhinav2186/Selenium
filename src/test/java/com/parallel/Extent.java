package com.parallel;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {

	@Test
	public void reporting()
	{
		
		ExtentReports erep = new ExtentReports();
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\abhinavreport.html");
		erep.attachReporter(esr );
		
		
		ExtentTest testa = erep.createTest("test1");
		testa.log(Status.PASS,"Status is pass");
		
		ExtentTest testb = erep.createTest("test2");
		testb.log(Status.FAIL,"Status is fail");
		
		ExtentTest testc = erep.createTest("test3");
		testc.log(Status.SKIP,"Status is skip");
		
		
		erep.flush();
		
		
	}
	
	
	
	
	
}
