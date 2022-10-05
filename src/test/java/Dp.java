import java.io.IOException;

public class Dp {

	
	public static Object[][] getdatafromexcel() throws IOException
	{
		
	String eloc = "C:\\Users\\Abhinav\\eclipse-workspace\\ProjectExcel\\ExcelFolder\\DataSheet.xlsx";
	DataFromEx d = new DataFromEx(eloc,"userdata");	
	
	Object[][] arrayhavingdata =  new Object[3][2];
	
	
	
	for (int i =1;i<4;i++)
	{
		for(int j=0;j<2;j++)
		{
			
			String datafromforloop = d.getStringcelldata();
			arrayhavingdata[3][2] = datafromforloop;
			
			System.out.println(datafromforloop);
		}
		
		
		
		
	}
		
		return arrayhavingdata;
		
		
	}
	
	
	
	
	
	
}
