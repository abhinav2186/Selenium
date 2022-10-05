import java.io.IOException;

import org.testng.annotations.Test;

public class DataProviderClass {

	@Test
	public static Object[][] getting_all_data_from_excel_via_for_loop(String locationofexcelfile, String sheetname) throws IOException
	{
		locationofexcelfile = "C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\ExcelFolder\\DataSheet.xlsx";
		ExtractingDataFromExcelFile ed = new ExtractingDataFromExcelFile(locationofexcelfile,"userdata");
		
		int rowCount = ed.find_no_of_rows();
		int colCount = ed.find_no_of_cols(0);
		
		
		Object[][] arraycontainingforloopdata = new Object[rowCount-1][colCount];
		
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0; j<colCount;j++)
			{
				
				String dataobtainedfromforloop = ed.get_string_celldata(i, j);
				arraycontainingforloopdata[i-1][j] = dataobtainedfromforloop;
				
				System.out.println(dataobtainedfromforloop);
				
			}
		}
		
		
		
		return arraycontainingforloopdata;
		
		
		
	}
	
	
	
	
}
