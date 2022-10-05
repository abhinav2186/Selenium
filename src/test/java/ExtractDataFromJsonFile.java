import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ExtractDataFromJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\JsonFolder\\userdata.json");
		
		Object obj = jsonparser.parse(reader);
		//need to convert this java object into json object so that we can read data from json
		
		JSONObject jsonobj =(JSONObject)obj;
		String uname=(String)jsonobj.get("Username");
		String pass =(String)jsonobj.get("Password");

		System.out.println(uname+" -------  " + pass);
	}

}
