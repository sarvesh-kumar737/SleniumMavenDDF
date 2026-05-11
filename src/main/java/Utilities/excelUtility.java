package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility 
{

	
	// read data from the excel file
	
	public static Object[][] getTestData(String filepath, String sheetName) throws IOException
	{
		
		
		FileInputStream fs = new FileInputStream(filepath);
		 XSSFWorkbook workbook = new XSSFWorkbook(fs);
		 XSSFSheet sheet = workbook.getSheet(sheetName);
		
		
	     int rowCount = sheet.getPhysicalNumberOfRows();
	        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
	        System.out.println("Row count is" +rowCount);
		    System.out.println("Row count is" +colCount);
		       
		       
		       
	
		
		return null;
		
		

		
			
		
		
		
		
			
		
		
	}
	
		
	
	public static void main(String[] args ) throws IOException
	{
 
		String filepath = System.getProperty("user.dir")
		        + "\\src\\test\\resources\\testdata\\LoginData.xlsx";
		
		excelUtility.getTestData(filepath, "Sheet1");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
