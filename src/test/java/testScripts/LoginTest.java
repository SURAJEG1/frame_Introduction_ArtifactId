package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;

public class LoginTest {

	@Test
	public void tc001() 
	{
		WebDriver driver=new ChromeDriver();     //Driver initialization 
		LoginPageObject lpo=new LoginPageObject(driver); // Create Object of "LoginPageObject" class
		lpo.launchedAndLogin("suraj@gmail.com", "admin123");  // Object calling and given parameter. 
	}
	
	@Test
	public void tc002() {
	Assert.assertTrue(5<2);
		
	}
	
	
	
	
	
	
	
	
	
}
