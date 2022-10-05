import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardSoftAssertionsPractical {

	@Test
	 public void google() throws InterruptedException
	{
		 WebDriver driver = WebDriverManager.chromedriver().create();
		 driver.get("https://www.facebook.com");
		 Thread.sleep(1000L);
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abhinav",Keys.ENTER);
		
		 Thread.sleep(5000);
		SoftAssert soft = new SoftAssert(); 
	//TitleAssertion
		 String Actualtitle =driver.getTitle();
		 String Expectedtitle="Log in to Facebook";
		 assertEquals(Actualtitle, Expectedtitle,"title comparing -- ");
		 System.out.println(driver.getTitle());
		 
		 //URL ASSERTION
		 
		 String Actualurl=driver.getCurrentUrl();
		 String Expectedurl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0NTI3MTMzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		 soft.assertEquals(Actualurl,Expectedurl,"url is compared -- ");
	
	    //TextAssertion
		 
		 String Actualtext=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		 String Expectedtext = "The password that you've entered is incorrect. Forgotten password?";
		 soft.assertEquals(Actualtext,Expectedtext,"text is compared -- ");
		 
		 soft.assertAll();
		 
		 
		 
		 
	}
	
	
	
}
