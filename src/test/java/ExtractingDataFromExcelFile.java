import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExtractingDataFromExcelFile {

	String locationofexcelfile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	
	public ExtractingDataFromExcelFile(String locationofexcelfile, String nameofsheet) throws IOException
	{
		
		 locationofexcelfile = "C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\ExcelFolder\\DataSheet.xlsx";
		 workbook = new XSSFWorkbook(locationofexcelfile);
		 sheet = workbook.getSheet(nameofsheet);
		
		
	}
	
	
	
	public int find_no_of_rows() throws IOException
	{

		int rc = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are "+rc);	
         return rc;
	}



	public int find_no_of_cols(int rowNum) throws IOException
	{

		int cc = sheet.getRow(rowNum).getPhysicalNumberOfCells();
		System.out.println("no of columns are "+cc);	
        return cc;

	}


	public String get_string_celldata(int rowNum, int colNum) throws IOException
	{

		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(celldata);
        return celldata;

	}

	
	
	
}
