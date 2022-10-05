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

public class LoginClassForHrm {


	/*
	 * @DataProvider(name="testdata") public static Object[][] deliveryboy() throws
	 * IOException { String locationofexcelfile =
	 * "C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\ExcelFolder\\DataSheet.xlsx";
	 * 
	 * Object[][] dataindataprovider =
	 * DataProviderClass.getting_all_data_from_excel_via_for_loop(
	 * locationofexcelfile, "userdata");
	 * 
	 * return dataindataprovider;
	 * 
	 * }
	 */
	
	
	
	
	
	@Test(dataProvider="jsondp")
	public void login(String data) 
	{
      String users[] = data.split(",");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(users[0]);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(users[1]);
		
		
	}
	
	
	@DataProvider(name="jsondp")
	public String[] readJson() throws IOException, ParseException
	{
	// load the file where ur data is present for that make use of FileReader class
//		Create an object of jsonparser class for parsing json data 
		
		FileReader reader = new FileReader("C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\JsonFolder\\userdata.json");
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(reader);
		
		//Convert java object into json object so that you can parse json data
		
		JSONObject jasonobjectforaccessingjasondata=(JSONObject)obj;
		JSONArray userloginarray=(JSONArray)jasonobjectforaccessingjasondata.get("logindetails");
		String arr[] = new String[userloginarray.size()];
		
		for(int i=0;i<userloginarray.size();i++)
		{
			JSONObject users=(JSONObject)userloginarray.get(i);
			String u1 =(String)users.get("Username");
			String u2 = (String)users.get("Password");
			arr[i]=u1+","+u2;
			System.out.println(arr[i]);
			
			
		}
		
		return arr;
		
	}	
	
}
