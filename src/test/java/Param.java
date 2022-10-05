import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Param {

	@Parameters("browsername")
	@BeforeTest
	public void InitialiseBrowser(String browserofchoice)
	{
	
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("http://www.google.com");
	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String urls)
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get(urls);
	}
	
	
	
	
	
	
	
	
	
	
	
}
