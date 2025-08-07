package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.LoginPageObject;

public class LoginTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();     //Driver initialization 
		LoginPageObject lpo=new LoginPageObject(driver); // Create Object of "LoginPageObject" class
		lpo.launchedAndLogin("suraj@gmail.com", "admin123");  // Object calling and given parameter. 
	}
	
	
	
	
	
	
	
	
	
	
	
}
