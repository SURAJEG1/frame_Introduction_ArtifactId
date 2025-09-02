package excelDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public static void main(String[] args) throws IOException {
		
		String filepath="C:\\Users\\suraj\\OneDrive\\Desktop\\FB_LoginDetails.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("TestData");
		
		Row row=sheet.getRow(1);
			String un1 = row.getCell(0).toString();
			String pwd1 = row.getCell(1).toString();	
			
			Row row1=sheet.getRow(2);
			String un2 = row1.getCell(0).toString();
			String pwd2 = row1.getCell(1).toString();	
			
		
		System.out.println(un1 +" "+ pwd1);
		System.out.println(un2 +" "+pwd2);
		
		
		
		
		
		
		
	}
	
	
	

}
