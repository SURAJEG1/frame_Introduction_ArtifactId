package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;
import utilities.ExcelUtility;
import utilities.ScreenshotUtility;

public class LoginTest extends BasicTestComponent{

	@Test(dataProvider="excelData")
	public void tc001(String un, String pwd) throws IOException {

		//loginTestPossitive();
		//ScreenshotUtility screenshot=new ScreenshotUtility(driver);
		//screenshot.takeScreenshot(driver);


		System.out.println(un +" "+ pwd);

	}





	@DataProvider(name="excelData")
	public Object[][] getExcelData() throws IOException{
		String filepath="C:\\Users\\suraj\\OneDrive\\Desktop\\FB_LoginDetails.xlsx";
		String sheetname="TestData";
		
		return ExcelUtility.readExcelData(filepath,sheetname);
	}






}
