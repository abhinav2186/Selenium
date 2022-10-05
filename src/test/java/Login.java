import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	
	@Test(dataProvider="abhinav")
	public void login(String datastoredin1darray) 
	{
        String arraycontainingfinaldata[] = datastoredin1darray.split(",");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(arraycontainingfinaldata[0]);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(arraycontainingfinaldata[1]);
		
		
	}
	
	
	@DataProvider(name= "abhinav")
	public String[] readingjsondata() throws IOException, ParseException
	{
		FileReader reader = new FileReader("C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\JsonFolder\\userdata.json");
		
		JSONParser parser = new JSONParser();
		Object javaobject = parser.parse(reader);
		
		JSONObject jasonobjectforparsingdata=(JSONObject)javaobject;
		
		JSONArray loginarray =(JSONArray)jasonobjectforparsingdata.get("logindetails");
		
		String arr[] = new String[loginarray.size()];
		
		for(int i=0;i<loginarray.size();i++)
		{
			JSONObject users = (JSONObject)loginarray.get(i);
			String uname = (String)users.get("Username");
			String pass = (String)users.get("Username");
			
			
			arr[i]=uname+","+pass;
			
			System.out.println(arr[i]);
		}
		
		return arr;
	}
	
	
	
	
	
}
