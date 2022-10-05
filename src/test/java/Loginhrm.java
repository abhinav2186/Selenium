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

public class Loginhrm {

	
	
	@Test(dataProvider="datafromjson")
	public void login(String alldata) 
	{
       String finaldata[] = alldata.split(",");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(finaldata[0]);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(finaldata[1]);
		
		
	}


	@DataProvider(name =  "datafromjson")
	public String[] getting_data_from_jsonfile() throws IOException, ParseException
	{
		
		FileReader read = new FileReader("C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\JsonFolder\\userdata.json");
		//this class will help you to parse the json data present in the json file
		JSONParser jsonparsing = new JSONParser();
		
		Object javaobject = jsonparsing.parse(read);
		
		JSONObject jsonobject =(JSONObject)javaobject;
		
		JSONArray jsonarray = (JSONArray)jsonobject.get("logindetails");
		
		String arrayofdata[] = new String[jsonarray.size()];
		
		for(int i =0;i<jsonarray.size();i++)
		{
			JSONObject araycontainingdata=(JSONObject)jsonarray.get(i);
			String uname = (String)araycontainingdata.get("Username");
			String pass =  (String)araycontainingdata.get("Password");
			
			arrayofdata[i]=uname+","+pass;
			System.out.println(arrayofdata[i]);
			
			
		}
		
		
		
	return arrayofdata;	
		
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
