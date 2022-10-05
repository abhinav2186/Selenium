import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataFromEx {
    String excelloc;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	DataFromEx(String excelloc, String sheetname) throws IOException
	{
		excelloc = "C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\ExcelFolder\\DataSheet.xlsx";
		wb = new XSSFWorkbook(excelloc);
		sheet = wb.getSheet(sheetname);
		
		
		
		
	}
	
	
public int nor() throws IOException 
{   
	
	int rc = sheet.getPhysicalNumberOfRows();
	System.out.println("row count is "+rc);
	return rc;	
}	


public int noc() throws IOException
{

	int cc = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("col count is "+cc);
	
	return cc;
}



public String getStringcelldata() throws IOException
{

	String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println("cellvalue is "+cellvalue);
    return cellvalue;
}
	
	
	
	
}
